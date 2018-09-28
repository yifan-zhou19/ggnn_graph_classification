package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000000];
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = 0;
		for (j = 1;j <= n,k < 1;j++)
		{
			if (a[j] != x)
			{
				System.out.print(a[j]);
				k++;
			}
		}
		for (m = j;m <= n;m++)
		{
			if (a[m] != x)
			{
				System.out.print(" ");
				System.out.print(a[m]);
			}
		}
		return 0;
	}
}

