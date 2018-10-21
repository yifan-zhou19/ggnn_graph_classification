package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int k;
		String a = new String(new char[100000]);
		char m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int t = 0;
			len = a.length();
			for (j = 0;j < len;j++)
			{
				for (k = j + 1;k < len;k++)
				{
						m = a.charAt(j);
						if (a.charAt(k) == m)
						{
							a = tangible.StringFunctions.changeCharacter(a, k, '0');
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
						}
				}
			}
					for (j = 0;j < len;j++)
					{
						if (a.charAt(j) != '0')
						{
							System.out.print(a.charAt(j));
							System.out.print("\n");
						t = 1;
						break;
						}
					}
						if (t == 0)
						{
							System.out.print("no");
							System.out.print("\n");
						}
		}
		return 0;
	}






}

