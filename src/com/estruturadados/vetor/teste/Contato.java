package com.estruturadados.vetor.teste;

public class Contato {

    private String name;
        private String email;

        public Contato(String name) {
            this.name = name;
            this.email = name + "@email.com";
        }


        public String getName() {
            return name;
        }


        public String getEmail() {
            return email;
        }


        @Override
        public String toString() {
            return "Contato [name=" + name + ", email=" + email + "]";
        }


        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((email == null) ? 0 : email.hashCode());
            return result;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Contato other = (Contato) obj;  
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (email == null) {
                if (other.email != null)
                    return false;
            } else if (!email.equals(other.email))
                return false;
            return true;
        }


        
    
}
