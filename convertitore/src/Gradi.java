public class Gradi {
    Double celisius;
    Double fahrenheit;

    Double tofixed(Double d){
        return Math.round(d * 1000.0) / 1000.0;
    }

    Double celsiusToFahrenheit (Double gradiC) {return tofixed(gradiC * 9 / 5 + 32);}
    Double fahrenheitToCelsius (Double gradiF) {return tofixed((gradiF - 32) * 5 / 9);}

    void cInput(Double value){
        if(value == null){
            this.fahrenheit = null;
        }
        else{
            this.fahrenheit = this.celsiusToFahrenheit(value);
        }
    }

    void fInput(Double value){
        if(value == null){
            this.celisius = null;
        }
        else{
            this.celisius = this.fahrenheitToCelsius(value);
        }
    }


}
