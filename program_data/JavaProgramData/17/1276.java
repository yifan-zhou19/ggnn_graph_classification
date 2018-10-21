package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		while (scanf("%s", a) == 1)
		{
			b = a;
			int len = a.length();
			int i;
			int t;
			int s;
			int q = 1;
			while (q != 0)
			{
				q = 0;
				t = -1;
				s = -1;
				for (i = 0;i < len;i++)
				{
					if (a.charAt(i) == 40)
					{
						t = i;
					}
					else if (a.charAt(i) == 41)
					{
						if (t >= 0)
						{
							a = tangible.StringFunctions.changeCharacter(a, t, 48);
							a = tangible.StringFunctions.changeCharacter(a, i, 48);
							q = 1;
							break;

						}

					}
				}


			}
			for (i = 0;i < len;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (a.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.print("\n");


		}
	}
}

