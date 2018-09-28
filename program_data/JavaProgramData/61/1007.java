package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[100];
		int[] s = new int[100];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		a = 1;
		b = 1;
		f[0] = a;
		f[1] = b;
		for (i = 0;i < n;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 2;j < 100;j++)
		{
			f[j] = f[j - 1] + f[j - 2];
		}
		for (i = 0;i < n;i++)
		{
			a = s[i];
			System.out.print(f[a - 1]);
			System.out.print("\n");
		}
		return 0;
	}


}

