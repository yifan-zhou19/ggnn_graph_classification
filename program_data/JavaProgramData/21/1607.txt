package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		int j;
		int[] a = new int[1000];
		int maxm = -1;
		int minm = 2147483647;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						   s += a[i];
						   if (a[i] > maxm)
						   {
							   maxm = a[i];
						   }
						   if (a[i] < minm)
						   {
							   minm = a[i];
						   }
		}
		int s1 = minm * n;
		int s2 = maxm * n;
		if (s2 - s > s - s1)
		{
		System.out.print(maxm);
		}
		if (s2 - s < s - s1)
		{
		System.out.print(minm);
		}
		if (s2 - s == s - s1)
		{
		System.out.print(minm);
		System.out.print(",");
		System.out.print(maxm);
		System.out.print("\n");
		}
		return 0;
	}

}

