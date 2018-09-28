package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[100][100];
		char v;
		int i;
		for (i = 0;i < 100;i++)
		{
			for (int j = 0;j < 100;j++)
			{
				v = System.in.read();
				if ((v == ' ') || (v == '\n'))
				{
				break;
				}
				else
				{
				c[i][j] = v;
				}
			}
			if (v == '\n')
			{
			break;
			}
		}
		for (int k = i;k >= 0;k--)
		{
			if (k == i)
			{
			System.out.print(c[k]);
			}
			else
			{
			System.out.print(' ');
			System.out.print(c[k]);
			}
		}
		return 0;
	}

}
