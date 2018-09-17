package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[1000]);
		  int i;
		  int sum;
		  str = new Scanner(System.in).nextLine();
		  i = 0;
		  sum = 1;
		  while (str.charAt(i) != '\0')
		  {
			  while (str.charAt(i) == str.charAt(i + 1) || str.charAt(i) == str.charAt(i + 1) + 32 || str.charAt(i) == str.charAt(i + 1) - 32)
			  {
			  sum = sum + 1;
			  i = i + 1;
			  }
		  if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		  {
		  str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
		  }
		  System.out.printf("(%c,%d)",str.charAt(i),sum);
		  i = i + 1;
		  sum = 1;
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

