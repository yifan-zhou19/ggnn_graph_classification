package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String s = new String(new char[100]);
		   String a = new String(new char[100]);
		   String b = new String(new char[100]);
		   s = new Scanner(System.in).nextLine();
		   a = new Scanner(System.in).nextLine();
		   b = new Scanner(System.in).nextLine();

		   int ls = s.length();
		   int la = a.length();

		   int i;
		   int j;
		   int t;
		   for (i = 0;i < ls;i++)
		   {
			   t = 1;
			   for (j = 0;j < la;j++)
			   {
				   if (a.charAt(j) == s.charAt(i + j))
				   {
						t = 1;
						continue;
				   }

				   if (a.charAt(j) != s.charAt(i + j))
				   {
						t = 0;
						break;
				   }
			   }

			   if (t == 1)
			   {
				   if (i != 0 && s.charAt(i - 1) != ' ')
				   {
						t = 0;
				   }
			   }

			   if (t == 1)
			   {
					System.out.printf("%s",b);
					i += la - 1;
			   }
			   if (t == 0)
			   {
					System.out.printf("%c",s.charAt(i));
			   }
		   }





		   return 0;
	}

}
