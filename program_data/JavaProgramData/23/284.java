package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[20];
		char[][] c = new char[20][40];
		char d;
		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				d = System.in.read();
				if (d != ' ' && d != '\n')
				{
					c[i][j] = d;
				}
				else
				{
					break;
				}
				a[i]++;
			}
			if (d == '\n')
			{
				break;
			}
		}
		for (;i >= 1;i--)
		{
			for (j = 0;j <= a[i] - 1;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			System.out.print(" ");
		}
		for (j = 0;j <= a[i] - 1;j++)
		{
			System.out.printf("%c",c[0][j]);
		}
		return 0;
	}
}
