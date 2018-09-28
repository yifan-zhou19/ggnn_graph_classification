package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  String c = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  int i;
		  int b;
		  int d;
		  int e;
		  if (a.charAt(1) == '\0')
		  {
					 System.out.print("0\n");
					 System.out.printf("%c",a.charAt(0));
		  }
		  else if (a.charAt(2) == '\0' && a.charAt(0) - '0' == 1)
		  {

				if (a.charAt(1) - '0' < 3)
				{
					System.out.print("0\n");
					System.out.printf("%c",a.charAt(0));
					System.out.printf("%c",a.charAt(1));
				}
				else
				{
					System.out.print("1\n");
					System.out.printf("%d",a.charAt(1) - '0' - 3);
				}
		  }
		   else
		   {
				i = 0;
				b = a.charAt(i) - '0';
				while (a.charAt(i) != '\0')
				{
			 d = b / 13;
			 e = b % 13;
			 b = e * 10 + (a.charAt(i + 1) - '0');
			 c = tangible.StringFunctions.changeCharacter(c, i, d + '0');
			 i++;
				}
		   if (c.charAt(0) == '0' && c.charAt(1) != '0')
		   {
			   i = 1;
			   while (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			   {
				   System.out.printf("%c",c.charAt(i));
				   i++;
			   }
		   }
		   else if (c.charAt(0) == '0' && c.charAt(1) == '0')
		   {
			   i = 2;
			   while (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			   {
				   System.out.printf("%c",c.charAt(i));
				   i++;
			   }
		   }
		   else
		   {
			   i = 0;
			   while (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			   {
				   System.out.printf("%c",c.charAt(i));
				   i++;
			   }
		   }
		  System.out.printf("\n%d",e);
		   }
	}
}

