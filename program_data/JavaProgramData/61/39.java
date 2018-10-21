package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int i = 0;
		int j = 0;
		int[] f = new int[30];
		for (i = 0;i < 30;i++)
		{
			f[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			f[1] = 1;
			f[2] = 1;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				for (j = 3;j <= a;j++)
				{
					f[j] = f[j - 1] + f[j - 2];
				}
				System.out.print(f[a]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

