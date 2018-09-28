package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   final String c = "";
	   final String s = "";
	   char p;
	   int y = 0;
	   int i;
	   int j;
	   int b;
	   c = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   int z = (c.charAt(0) - '0') * 10 + c.charAt(0 + 1) - '0';
	   if (c.length() < 2)
	   {
		  System.out.print('0');
		  System.out.print("\n");
		  System.out.print(c);
		  System.out.print("\n");
	   }
	   else if (c.length() == 2)
	   {
		  System.out.print(Integer.parseInt(c) / 13);
		  System.out.print("\n");
		  System.out.print(Integer.parseInt(c) % 13);
		  System.out.print("\n");
	   }
	   else
	   {
		   for (i = 0;i < c.length() - 2;i++)
		   {
			  b = (c.charAt(i) - '0') * 10 + c.charAt(i + 1) - '0'; //??????13
			  if (b >= 13)
			  {
				 s = tangible.StringFunctions.changeCharacter(s, i, '0' + b / 13);
				 c = tangible.StringFunctions.changeCharacter(c, i + 1, '0' + b % 13);
			  }
			  else //??13
			  {
				 b = (c.charAt(i) - '0') * 100 + (c.charAt(i + 1) - '0') * 10 + (c.charAt(i + 2) - '0');
				 s = tangible.StringFunctions.changeCharacter(s, i + 1, '0' + b / 13);
				 c = tangible.StringFunctions.changeCharacter(c, i + 1, '0' + b % 13 / 10);
				 c = tangible.StringFunctions.changeCharacter(c, i + 2, '0' + b % 13 % 10);
			  }
		   }
		   y = c.charAt(c.length() - 1) - '0';
		   int r;
		   if (z >= 13)
		   {
			   r = c.length() - 1;
		   }
		   else
		   {
			   r = c.length() - 2; //????
		   }
		   for (i = 0;i < 100;i++)
		   {
			  if (s.charAt(i) != '\0')
			  {

				 for (int k = i + 1;k < r;k++)
				 {
					if (s.charAt(k) == '\0')
					{
					   s = tangible.StringFunctions.changeCharacter(s, k, '0');
					}
				 }
				 break;
			  }
		   }
			  for (i = 0;i < 100;i++)
			  {
				 for (j = 0;j < 100;j++)
				 {
					if (s.charAt(j) == '\0')
					{
					   p = s.charAt(j);
					   s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
					   s = tangible.StringFunctions.changeCharacter(s, j + 1, p);
					}
				 }
			  }
			  for (i = 0;i < r;i++)
			  {
				  System.out.print(s.charAt(i));
			  }
		   System.out.print("\n");
		   System.out.print(y);
		   System.out.print("\n");
	   }
	   return 0;
	}

}

