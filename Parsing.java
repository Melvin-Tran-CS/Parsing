public class Parsing
{
	static int[] num = new int[2];
	static String[] input = new String[2];
	static String[] parseReturn = new string[2];
	
	String parsingMethod(String[] string)
	{
		String returnString=null;
		int returnInt=null;
		float returnFloat=null;
		try
		{
			
			returnString = Integer.parseInt(string[0]);
			System.out.println("Please restart the program and type digits");
			
		}
		catch(NumberFormatException e)
		{
			try
			{
				System.out.println("No decimals you dingus");
				returnFloat = Float.parseFloat(string[0]);
				System.out.println("You typed a decimal you retard,\nRestart the program and type in a number with no digits this time");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Dont mistype a digit");
				returnString = string[0];
				System.out.println("I just said dont mistype a digit you idiot, \nrestart the program and dont mess up this time");
			}
		}
		if (returnInt != null) return "integer";
		if (returnFloat != null) return "decimal";
		if (returnString != null)
		{
			Boolean returnBool=Boolean.parseBoolean(string[0]);
			if (returnBool == true) return "boolean";
			return "spelling mistake";
		}else 
		{
			System.out.println("Malfunctioned,needs review");
			System.exit(2);
		}
		return ;
	}
	public static void main (String[] args)
	throws ArrayIndexOutOfBoundsException, NumberFormatException
	{
		try
		{
			input[0] = args [0];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			input[0] = "2";
			System.out.println("Congrats ... I am using your ARGS[0]");
		}
		try
		{
			num[0] = Integer.parseInt(input[1]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("You must enter digits \n" + "Please restart the program with arguments, Thank you");
			System.exit(1);
		}
		System.out.println("Parsing an Integer with Try-Catch");
		System.out.println("from String" + input[0] + "to Integer" + num[0]);
		System.out.println("DONE");
		System.exit(0);
		
	}
}