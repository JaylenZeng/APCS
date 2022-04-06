public class BigSib {
 	String HelloMsg;
	String greeting;
        public BigSib () {
		HelloMsg = "Word up" ;
		greeting = "new guy!";
	}

	public void setHelloMsg(String message) {
		HelloMsg = message;

        }


	public String greet(String name) {
                String s;
                s = (HelloMsg +" "+ name);
                return s;
	}
}
