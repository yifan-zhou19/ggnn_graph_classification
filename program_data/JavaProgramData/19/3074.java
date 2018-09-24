package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int[] t = new int[100];
		int at;
		int bt;
		int p;
		char[][] s = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		for (i = 0;i < 100;i++)
		{

			for (j = 0;j < 100;j++)
			{
				s[i][j] = System.in.read();
				if (s[i][j] == ' ')
				{
					t[i] = j;
					break;
				}
				else
				{
					if (s[i][j] == '\n')
					{
						t[i] = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	n = i + 1;
		for (j = 0;j < 100;j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, System.in.read());
			if (a.charAt(j) == '\n')
			{
				at = j;
				break;
			}
		}
		for (j = 0;j < 100;j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, System.in.read());
			if (b.charAt(j) == '\n')
			{
				bt = j;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == at)
			{
				p = 1;
				for (j = 0;j < at - 1;j++)
				{
					p *= s[i][j] - a.charAt(j) + 1;
				}
					if (p == 1)
					{
						for (j = 0;j < bt;j++)
						{
							s[i][j] = b.charAt(j);
						}
						t[i] = bt;
					}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				for (j = 0;j < t[i];j++)
				{
					System.out.print(s[i][j]);
				}
			}
			else
			{
				System.out.print(" ");
				for (j = 0;j < t[i];j++)
				{
					System.out.print(s[i][j]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

