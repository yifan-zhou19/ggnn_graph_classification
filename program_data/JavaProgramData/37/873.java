package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i = 1;
			int j = 1;
			int k = 1;
			int l;
			int t;
			String a = new String(new char[100000]);
			char x;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (;k <= n;k++)
			{
					a = ConsoleInput.readToWhiteSpace(true).charAt(0);
					l = a.length();
					for (i = 0;i < l - 1;i++)
					{
							t = a.charAt(i);
							for (j = i + 1;j < l;j++)
							{
									if (a.charAt(j) == 1)
									{
										continue;
									}
									if (a.charAt(j) == t)
									{
											a = tangible.StringFunctions.changeCharacter(a, i, 1);
											a = tangible.StringFunctions.changeCharacter(a, j, 1);
									}
							}
					}
					for (i = 0;i <= l;i++)
					{
							if (a.charAt(i) != 1)
							{
									System.out.print(a.charAt(i));
									System.out.print("\n");
									break;
							}
					}
					if (i == l)
					{
						System.out.print("no");
						System.out.print("\n");
					}
			}
			return 0;
	}

}

