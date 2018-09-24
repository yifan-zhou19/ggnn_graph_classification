package <missing>;

public class GlobalMembers
{
	public static void del(int[] a, int n)
	{
		int[] s = new int[300];
		int i;
		int j;
		int b;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			b = 1;
			for (j = 0;j < k;j++)
			{
				if (a[i] == s[j])
				{
					b = 0;
				}
			}
			if (b != 0)
			{
				s[k] = a[i];
				k++;
			}
		}
		System.out.printf("%d",s[0]);
		for (j = 1;j < k;j++)
		{
			System.out.printf(",%d",s[j]);
		}
	}
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int n;
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
		del(a, n);
	}
}

