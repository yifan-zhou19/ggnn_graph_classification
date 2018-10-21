package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int i;
	public static String a = new String(new char[100]);
	public static char[][] b = new char[10000][100];
	public static void f(int x)
	{
		int u = 1;
		int tt = String.valueOf(b[x]).length();
		for (int q = 0;q < tt;q++)
		{
			if (b[x][q] != b[x][tt - q - 1])
			{
				u = 0;
				break;
			}
		}
		if (u == 1)
		{
			System.out.print(b[x]);
			System.out.print("\n");
		}
		return;
	}
	public static int Main()
	{
		int num = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		t = a.length();
		for (int j = 2;j <= t;j++)
		{
			for (i = 0;i < t - j + 1;i++)
			{
			num++;
			for (int k = 0;k < j;k++)
			{
				b[num][k] = a.charAt(i + k);
			}
			f(num);
			}
		}
		return 0;
	}

}

