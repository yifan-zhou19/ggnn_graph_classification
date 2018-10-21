package <missing>;

public class GlobalMembers
{
	public static int max(int[] b)
	{
		int l;
		int m;
		for (l = 1;l < 25;l++)
		{
			for (m = l + 1;m < 26;m++)
			{
				if (b[l] < b[m])
				{
					int s;
					s = b[l];
					b[l] = b[m];
					b[m] = s;
				}
			}
		}
		return b[1];
	}
	public static int Main()
	{
		int[] a = new int[26];
		int[] b = new int[26];
		int i;
		int j;
		int k;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		b[1] = 1;
		for (i = 2;i <= k;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[i] = 1;
		}
		for (j = k - 1;j > 0;j--)
		{
			int[] c = new int[26];
			int s = 1;
			for (l = j + 1;l <= k;l++)
			{
				if (a[j] >= a[l])
				{
					c[s] = b[l];
					s++;
				}
			}
			m = max(c);
			b[j] = b[j] + m;
		}
		System.out.printf("%d\n",max(b));
		return 0;
	}
}

