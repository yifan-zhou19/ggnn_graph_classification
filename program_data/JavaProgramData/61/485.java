package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int casenum;
		casenum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] f = new int[100];
		f[0] = 0;
		f[1] = 1;
		int i;
		for (i = 2;i <= 20; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		while (casenum-- != 0)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int i;
			int j;
			System.out.print(f[a]);
			System.out.print("\n");
		}
		return 0;
	}
}

