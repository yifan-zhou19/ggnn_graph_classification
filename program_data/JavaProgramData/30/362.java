package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[] a = new int[101];
		double t = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (j = 1;j <= n;j++)
		{
			if (j % 7 != 0 && (j - 7) % 10 != 0 && !((j - 70) < 10 && (j - 70)>0))
			{
				t = t + Math.pow(a[j],2.0);
			}
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

