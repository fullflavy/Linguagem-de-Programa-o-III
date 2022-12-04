public class Data{
	// Atributos
    private int dia;
	private int mes;
	private int ano;

	//Construtor
    public Data(int dia, int mes, int ano){
        setData(dia, mes, ano);
    }

    public Data(){
        this.dia = 28;
        this.mes = 2;
        this.ano = 2002;
    }

    public Data(Data data){
        this(data.getDia(), data.getMes(), data.getAno());
    }

    public void setData(){
		if(verificaData(dia, mes, ano)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
	    }else{
			mensagemErro();
		}
    }
    
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
	
    public void inicializarData(){
         dia = getDia();
		 mes = getMes();
		 ano = getAno();
    }

    public void imprimirData(){
        System.out.printf("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    public void imprimirDataExtenso(){
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("%02d de %s de %d.\n", this.dia, mes[(this.mes - 1)], this.ano);
    }
    
	public boolean verificaData(int dia, int mes, int ano){
		if((dia <= 0 || dia > 31) || (mes <= 0 || mes > 12)|| ano <= 0){
			return false;
		}
		if((mes == 2) && (dia != 28) && (ano%4 != 0)){                       //se o ano nao eh bisexto
			return false;
		}
		if((mes == 2) && (dia != 29) && (ano%4 == 0)){                      //se o ano eh bisexto
			return false;  
		}
		if(dia > 30 && ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11))){  //para meses que deveriam ter 30 dias.
			return false;
		}
		return true;
	}

	public boolean isPrevious(Data outraData){
        if(outraData.getAno() < this.ano){
            return true;
        }else if(outraData.getAno() > this.ano){
            return false;
        }else{
            if(outraData.getMes() < this.mes){
                return true;
            }else if(outraData.getMes() > this.mes){
                return false;
            }else{
                if(outraData.getDia() < this.dia){
                    return true;
                }
                return false;
            }
        }
    }
    
	//retorna o modulo de um numero.
	private int mode(int n){
    	if(n > 0){
			return n;
    	}else{
			return ((-1) * n);
		}
	}

	 public boolean isPrevious(int dia, int mes, int ano){
        if(ano < this.ano){
            return true;
        }else if(ano > this.ano){
            return false;
        }else{
            if(mes < this.mes){
                return true;
            }else if(mes > this.mes){
                return false;
            }else{
                if(dia < this.dia){
                    return true;
                }
                return false;
            }
        }
    }

	public int howManyDays(int dia, int mes, int ano){
    	if(isPrevious(dia, mes, ano)){
        	float difA = (float)mode(ano - this.ano) - 1;
			float difM1 = 12.0f - mes;
        	float difM2 = this.mes - 1.0f + 1;
        	float dias = (difA * 365.25f) + ((difM1 + difMo2) * 365.25f / 12);
        	return (int)(-dias);
    	}else{
       		float difA = (float)mode(ano - this.ano) - 1;
			float difM1 = 12.0f - mes;
        	float difM2 = this.mes - 1.0f + 1;
        	float dias = (difA * 365.25f) + ((difM1 + difMo2) * 365.25f / 12);
        	return (int)dias;
    	}    
	}

	public void mensagemErro(){
		System.out.printf("\nErro: data inexistente.");
		System.exit(-1);
	}
	
	private static boolean isBisexto(Data d){
    	if((d.getAno() % 4 == 0) && ((d.getAno() % 100 == 0) && (d.getAno() % 400 == 0))){
    	    return true;
    	}
    	return false; 
	}

	public static int howManyDaysUntilEndYear(Data d){
        int[] diaM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int soma = 0;

        if(Data.isBisexto(d)){
            diaM[1] = 29;
        }
		for(int i = d.getMes(); i <= 12; i++){
            soma = soma + diaM[i];
    	}

        return soma - d.getDia();
	}

	public static int howManyDaysUntilNextMonth(Data d){
        int[] diaM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(Data.isBisexto(d)){
            diaM[1] = 29;
        }
	
        return diaM[d.getMes()] - d.getDia();
    }

	public String dayOfWeek(Data dD){
    	    int d = dD.getDia();
        	int m = dD.getMes();
        	int y = dD.getAno();
        	int k = 0;
        	String[] daysWeek = {"Sabado", "Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};

        	if(m == 1){
            	k = d + 2 * 13 + (3 * (13 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        	}else if(m == 2){
        	    k = d + 2 * 14 + (3 * (14 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        	}else{
        	    k = d + 2 * m + (3 * (m + 1) / 5) + y + (y / 4) - (y / 100) + (y / 400) + 2;
        	}
        	k = k % 7;
        	return daysWeek[k];
    }

	public static String dayToPrintShort(Data d){
        return d.getDia() + "/" + d.getMes() + "/" + d.getAno();
    }

	public static String dayToPrintLong(Data d){
        String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return d.getDia() + " de " + m[d.getMes() - 1] + " de " + d.getAno();
    }
}