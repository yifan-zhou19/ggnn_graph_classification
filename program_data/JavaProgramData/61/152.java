package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int[] a = new int[10000];
		int[] b = new int[100];
		b[0] = 1;
		b[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 2;j < 22;j++)
		{
			 b[j] = b[j - 1] + b[j - 2];
		}
		for (i = 0;i < n;i++)
		{
		System.out.print(b[a[i] - 1]);
		System.out.print("\n");
		}

		return 0;
	}

}

