package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static int[] c = new int[100];

	public static int Main()
	{
		//freopen("1.in","r",stdin);
		//freopen("1.out","w",stdout);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
				  a = ConsoleInput.readToWhiteSpace(true).charAt(0);
				  b = ConsoleInput.readToWhiteSpace(true).charAt(0);
				  int lena = a.length();
				  int lenb = b.length();
				  for (int i = 0;i < lena / 2;i++)
				  {
						  char t = a.charAt(i);
						  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(lena - 1 - i));
						  a = tangible.StringFunctions.changeCharacter(a, lena - 1 - i, t);
				  }
				   for (int i = 0;i < lenb / 2;i++)
				   {
						  char t = b.charAt(i);
						  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lenb - 1 - i));
						  b = tangible.StringFunctions.changeCharacter(b, lenb - 1 - i, t);
				   }
				   for (int i = 0;i < lenb;i++)
				   {
				   c[i] = a.charAt(i) - b.charAt(i);
				   }
				   for (int i = lenb;i < lena;i++)
				   {
				   c[i] = a.charAt(i) - '0';
				   }
				   for (int i = 0;i < lena - 1;i++)
				   {
					 if (c[i] < 0)
					 {
								  c[i] = 10 + c[i];
								  c[i + 1] -= 1;
					 }
				   }
				   for (int i = lena - 1;i >= 0;i--)
				   {
						   if (c[i] != 0)
						   {
									  for (int j = i;j >= 0;j--)
									  {
									  System.out.print(c[j]);
									  }
									  System.out.print("\n");
									  break;
						   }
				   }
		}
		return 0;
	}





}

