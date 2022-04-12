package as1;
class Student {
        private String SID;
        private String firstName;
        private String lastName; 
        private String postName;           //create object
        public Student(String SID,String postName,String firstName,String lastName){ 
        this.SID = SID; 
        this.postName = postName;
        this.firstName = firstName;
        this.lastName = lastName;
        }

    public String getFirstName(){
        return  firstName ;
    }
    public String getLastName(){    //Method get firstname,lastname.studentID
        return  lastName ;
    }
    public String getSID(){
        return  SID ;
    }
    public String getPostName(){
        return postName ;
    }
    
    public String toString(){       //Method return studentID,firstname,lastname
    return this.SID + "  "+this.postName+"  "+this.firstName + "  " + this.lastName;
    }
    public boolean compareTo(String lastName2) {
        return false;
    }

}
