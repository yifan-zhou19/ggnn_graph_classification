package <missing>;

public class GlobalMembers
{
	public static int fei(int k)
	{
		int[] f = new int[21];
		f[1] = 1;
		f[2] = 1;
		int i;
		for (i = 3; i <= 21; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[k];
	}
	public static int Main()
	{
		int i;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fei(a));
			System.out.print("\n");
		}

		return 0;
	}



}

