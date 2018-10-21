package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		int i;
		int j;
		int k;
		while (gets(s) != null)
		{
			int len;
			len = s.length();
			System.out.printf("%s\n",s);

			for (i = 0;i < len;i++)
			{
				int zuo = 0;
				int you = 0;
				if (s.charAt(i) != '(' && s.charAt(i) != ')')
				{
					System.out.print(" ");
				}
				else if (s.charAt(i) == '(')
				{
					for (j = i + 1;j <= len;j++)
					{
						if (s.charAt(j) == ')')
						{
							you++;
							if (you > zuo)
							{

								System.out.print(" ");
								break;
							}

						}
						if (s.charAt(j) == '(')
						{
							zuo++;
						}
						if (j == len)
						{
							System.out.print("$");
							break;
						}

					}
				}
				else if (s.charAt(i) == ')')
				{
					if (i == 0)
					{
						System.out.print("?");
					}
					for (j = i - 1;j >= 0;j--)
					{
						if (s.charAt(j) == '(')
						{
							zuo++;
							if (zuo > you)
							{
								System.out.print(" ");
								break;
							}

						}
						if (s.charAt(j) == ')')
						{
						   you++;
						}
						if (j == 0)
						{
							System.out.print("?");
						}

					}

				}
			}
			System.out.print("\n");


		}

		return 0;

	}

}
