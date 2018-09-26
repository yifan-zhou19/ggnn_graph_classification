package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100000]);
	   int i;
	   int t;
	   int len;
	   int j;
	   int k;
	   int cont;
	   int OK = 0;
	   char x;
	   t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
	   for (i = 0;i < t;i++)
	   {
			   OK = 0;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
			len = a.length();
			for (j = 0;j < len;j++)
			{
					if (a.charAt(j) != '0')
					{
						   x = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
						cont = 1;
						for (k = j;k < len;k++)
						{
							if (a.charAt(k) == x)
							{
							a = tangible.StringFunctions.changeCharacter(a, k, '0');
							cont++;
							}
						}
						if (cont == 1)
						{
							System.out.print(x);
							System.out.print("\n");
							OK = 1;
							break;
						}
					}
				else
				{
					continue;
				}
			}
			 if (OK == 0)
			 {
				 System.out.print("no");
				 System.out.print("\n");
			 }
	   }

	   return 0;
	}
}

