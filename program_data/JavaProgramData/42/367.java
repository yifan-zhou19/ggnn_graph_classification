package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????n?????ij?????k????k???l
		int i;
		int j;
		int k;
		int l = 0;
		int[] a = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n - l;i++)
		{
			if (a[i] == k)
			{
				l++;
				for (j = i;j <= n - l;j++)
				{
					a[j] = a[j + 1]; //??k???
				}
				i--;
			}
		}
		for (i = 1;i <= n - l - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - l]);
		return 0;
	}
}

