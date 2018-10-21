package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int x;
		 int i;
		 int j;
		 String str = new String(new char[100]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n + 1;i++)
		 {
			 str = new Scanner(System.in).nextLine();
		  x = str.length() - 1;
		  if (str.charAt(x) == 'r' || str.charAt(x) == 'y')
		  {
			  str = tangible.StringFunctions.changeCharacter(str, x - 1, '\0');
			  System.out.printf("%s",str);
			  System.out.print("\n");
		  }
		  else
		  {
			  str = str.substring(0, x - 2);
			  System.out.printf("%s",str);
			  System.out.print("\n");
		  }
		 }
	}


}

