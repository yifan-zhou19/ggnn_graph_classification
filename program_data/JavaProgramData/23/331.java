package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			char c;
			char[][] a = new char[101][101];
		int i = 1;
		int j = 0;
		while (true)
		{
			cin.get(c);
			if (c != 32 && c != 10)
			{
				a[i][j] = c;
				j++;
			}
			else
			{
				a[i][j] = '\0';
				if (c == 32)
				{
					i++;
					j = 0;
				}
				else
				{
					break;
				}
			}
		}
		for (j = i;j > 1;j--)
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[1]);
	}

}
