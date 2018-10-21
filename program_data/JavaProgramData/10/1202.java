package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[N];
		int[] s = new int[N];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			s[i] = 1;
		}
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] <= a[i] != 0 && s[i] < s[j] + 1)
				{
					s[i] = s[j] + 1;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			max = (max > s[i])?max:s[i];
		}
		System.out.printf("%d",max);
		return 0;
	}
}

