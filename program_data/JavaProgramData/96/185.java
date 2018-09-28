package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] b = new int[100];
		  int l;
		  int m;
		  int i;
		  String a = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  l = a.length();
		  if (l == 1)
		  {
		  System.out.print("0\n");
		  System.out.printf("%s\n",a);
		  }
		  else
		  {
		  for (i = 0;i < l;i++)
		  {
						  b[i] = a.charAt(i) - '0';
		  }
		   String c = new String(new char[100]);
		   String d = new String(new char[100]);
		   String e = new String(new char[100]);
		   int k;
		   int t = 0;
		   for (i = 0;i < l;i++)
		   {
						   k = (b[i] + t * 10) / 13;
						   t = (10 * t + b[i]) % 13;
						   c = tangible.StringFunctions.changeCharacter(c, i, k + '0');
		   }
		   m = c.length();
			   if (c.charAt(0) - '0' == 0)
			   {
					if (c.charAt(1) - '0' == 0)
					{
						if (l == 2)
						{
						System.out.print("0\n");
						}
						else
						{
						   for (i = 0;i < l - 2;i++)
						   {
					   d = tangible.StringFunctions.changeCharacter(d, i, c.charAt(i + 2));
						   }
					   d = tangible.StringFunctions.changeCharacter(d, i, '\0');
					   System.out.printf("%s\n",d);
						}
					}
					   else
					   {
						 for (i = 0;i < l - 1;i++)
						 {
					   e = tangible.StringFunctions.changeCharacter(e, i, c.charAt(i + 1));
						 }
					   e = tangible.StringFunctions.changeCharacter(e, i, '\0');
					   System.out.printf("%s\n",e);
					   }
			   }
			   else
			   {
					   System.out.printf("%s\n",c);
			   }
		   System.out.printf("%d",t);
		  }
		   System.in.read();
		   System.in.read();
	}



}

