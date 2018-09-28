package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  String b = new String(new char[200]);
		  int c;
		  int h;
		  int m;
		  String s = new String(new char[200]);
		  s = new Scanner(System.in).nextLine();
		  int l = s.length();
		  int i;
		  int j;
		  int k;
		  if (l == 2)
		  {
				  c = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
				  h = c / 13;
				  m = c % 13;
				  System.out.printf("%d\n%d\n",h,m);
		  }
		  else if (l == 1)
		  {
			   c = s.charAt(0) - '0';
			   System.out.printf("0\n%d",c);
		  }
		  else if (l > 2)
		  {
			   if ((s.charAt(0) - '0') * 10 + s.charAt(1) - '0' >= 13)
			   {

			  c = s.charAt(0) - '0';
			   for (i = 0;i < l - 1;i++)
			   {

								a = c * 10 + s.charAt(i + 1) - '0';
							   b = tangible.StringFunctions.changeCharacter(b, i, a / 13 + '0');
							   c = a % 13;


			   }
					 b = tangible.StringFunctions.changeCharacter(b, i, '\0');
					 System.out.printf("%s\n%d\n",b,c);
			   }
			   else if ((s.charAt(0) - '0') * 10 + s.charAt(1) - '0' < 13)
			   {
					c = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
					for (i = 0;i < l - 2;i++)
					{
									a = c * 10 + s.charAt(i + 2) - '0';
									b = tangible.StringFunctions.changeCharacter(b, i, a / 13 + '0');

									c = a % 13;
					}
					 b = tangible.StringFunctions.changeCharacter(b, i, '\0');
					System.out.printf("%s\n%d\n",b,c);
			   }
		  }
	}

}

