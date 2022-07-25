
    public class Distanza {
        Double miles;
        Double kilometers;

        Double tofixed(Double d){
            return Math.round(d * 1000.0) / 1000.0;
        }

        public double milesToKilometers (Double distanzaM) {return tofixed(distanzaM * 1.60934);}
        public double kilometersToMiles (Double distzanKm) {return tofixed(distzanKm / 1.60934);}

        void kInput(Double value){
            if(value == null){
                this.miles = null;
            }
            else{
                this.miles = this.kilometersToMiles(value);
            }
        }

        void mInput(Double value){
            if(value == null){
                this.kilometers = null;
            }
            else{
                this.kilometers = this.milesToKilometers(value);
            }
        }

        void reset()
        {
            this.miles = null;
            this.kilometers = null;
        }


    }

