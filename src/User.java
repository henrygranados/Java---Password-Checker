//Users.java
public class User {

	//Declaring our instance variable
	private float FirstSSN;
	private float SecondSSN;
	private float ThirdSSN;
	private String Password;

	
	//Constructor
		public User(){
		      this(0,0,0);
		   }
		   public User(float num1){//Constructor for the for the first group of numbers
		      this(num1,0,0);
		   }
		   public User(float num1, float num2){//Constructor for the for the second group of numbers
		      this(num1,num2,0);
		   }
		   public User(float num1, float num2, float num3){//Constructor for the third group of numbers
		      SetSocialSecuritynumber(num1,num2,num3);
		   }
		   public void SetSocialSecuritynumber(float num1, float num2, float num3){// Setting all the numbers
		      setFirstSSN(num1);
		      setSecondSSN(num2);
		      setThirdSSN(num3);
		   }
		   public void setFirstSSN(float num1){       // Setting the first group of numbers
		      FirstSSN = ((num1>0 && num1<=999)?num1:0);
		   }
		   public void setSecondSSN(float num2){       //Setting the second group of numbers
		      SecondSSN= ((num2>0 && num2<=99)?num2:0);
		   }
		   public void setThirdSSN(float num3){       //Setting the third group of numbers
		      ThirdSSN = ((num3>0 && num3<=9999)?num3:0);
		   }
		   public float getFirstSSN(){           //Getting the first group of numbers
		      return FirstSSN;
		   }
		   public float getSecondSSN(){           //Getting the second group of numbers
		      return SecondSSN;
		   }
		   public float getThirdSSN(){           // Getting the second group of numbers
		      return ThirdSSN;
		   }
		   public String Formatting(){         //Formatting the Social Security Number
			   return String.format("%03d-%02d-%04d", getFirstSSN(),getSecondSSN(),getThirdSSN());
		   }
	
	public String getPassword() {
		return Password;
	}

	
	public void setPassword(String password) {
		password = password;
	}
}

