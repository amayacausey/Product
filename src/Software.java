public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;
    public Software(){

    }
    public Software(String programmer,String os,String platform){
        this.programmer=programmer;
        this.platform=platform;
        this.os=os;
    }
    //getters and setters
    public void setProgrammer(String programmer){
        this.programmer=programmer;
    }
    public String getProgrammer(){
        return this.programmer;
    }
    public void setPlatform(String platform){
        this.platform=platform;
    }
    public String getPlatform(){
        return this.platform;
    }
    public void setOs(String os){
        this.os=os;
    }
    public String getOs(){
        return this.os;
    }
    //Override
    public String toString() {

        String msg = super.toString();
        return msg = msg +"Os:                 " + os + "\n" +
                "Platform:           " +platform+ "\n"
                +"Programmer:           " +programmer+ "\n";
    }

    @Override
    public boolean equals(String programmer) {
        return this.programmer.equals(programmer);
    }
}


