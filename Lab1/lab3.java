class lab3 {
    String[] wordTokenize (String fileName){
        String wordArr[] = new String[9];
        int index=0;
        String temp = "";
        for(int i=0; i<fileName.length(); i++){
            if(((fileName.charAt(i))>=(char)32) && (fileName.charAt(i))<=(char)64){
                if(temp != "" && temp != null){
                    wordArr[index] = temp;
                    index++;
                    temp = "";
                }
            }
            else{
                temp = temp + String.valueOf(fileName.charAt(i));
            }}
        return wordArr;}
    String[] extractEmail (String fileName){
        String emailArr[] = new String[10];        
        int index=0;
        String temp = "";
        for(int i=0; i<fileName.length(); i++){
            if(((fileName.charAt(i))==(char)32) || (fileName.charAt(i))==(char)44) {
                if(temp != "" && temp != null){
                    emailArr[index] = temp;
                    index++;
                    temp = "";
                }}
            else{
                if(i == (fileName.length())-1){
                    temp = temp + String.valueOf(fileName.charAt(i));
                    emailArr[index] = temp;
                    index++;
                    temp = "";
                    break;
                }
                temp = temp + String.valueOf(fileName.charAt(i));
            }}
        return emailArr;}
    public static void main(String args[]){
        lab3 lab = new lab3();

        String wordFile = "Hello, How are you: hopefully you are Fine!";
        String emailfile = "awais4@gmail.com, sohu@gmail.com, awaissohu@gmail.com";
        String wordArr[];
        String emailArr[];

        wordArr = lab.wordTokenize(wordFile);
        emailArr = lab.extractEmail(emailfile);
       
        System.out.println(": Words : ");
        for(String i: wordArr){
            System.out.print(i + "    ");}

        System.out.println("\n: Emails : ");
        for(String i : emailArr){
            if(i != null)
            System.out.print(i + "    ");}
        }}