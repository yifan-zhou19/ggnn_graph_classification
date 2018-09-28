package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int len;
		len = a.length();
		String b = new String(new char[101]);
		int c;
		int i;
		int d;
		int m;
		if (len == 1)
		{
			System.out.print("0\n");
					System.out.printf("%c",a.charAt(0));
		}
			  else
			  {
				  c = (a.charAt(0) - '0') * 10 + a.charAt(1);
	 if (c - '0' < 13 && len == 2)
	 {
		 System.out.print("0\n");
						  System.out.printf("%d",c - '0');
	 }
	 else
	 {

		c = (a.charAt(0) - '0') * 10 + a.charAt(1);
		if (c - '0' >= 13)
		{
				  for (i = 0,d = 0;i <= len - 1;i++)
				  {
									   m = 0;
									   d = d * 10 + a.charAt(i) - '0';
									   m = d / 13;
									   if (i != 0)
									   {
										   b = tangible.StringFunctions.changeCharacter(b, i - 1, m + '0');
									   }
									   d = d % 13;
				  }
							 b = tangible.StringFunctions.changeCharacter(b, len - 1, '\0');
							 System.out.printf("%s\n",b);
							 System.out.printf("%d",d);
		}
	if (c - '0' < 13)
	{
		for (i = 0,d = 0;i <= len - 1;i++)
		{
									 m = 0;
							   d = d * 10 + (a.charAt(i) - '0');
							  m = d / 13;
									 if (i >= 2)
									 {
										 b = tangible.StringFunctions.changeCharacter(b, i - 2, m + '0');
									 }
									 d = d % 13;
		}
						   b = tangible.StringFunctions.changeCharacter(b, len - 2, '\0');


							System.out.printf("%s\n",b);
							System.out.printf("%d",d);
	}


	 }
			  }
				  System.in.read();
				  System.in.read();
































	}

}

