public class parsing
{
	static String[] input = new string[2];
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