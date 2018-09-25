package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n)
	{
		int i;
		int j = 0;
		int t;
		for (i = 0;i < n;i++)
		{
			if (a[j] < a[i])
			{
				j = i;
			}
		}
		if (j != 0)
		{
			t = a[j];
			a[j] = (a + 0);
			a[0] = t;
		}
		return a;
	}
	public static void Main()
	{
		int i;
		int n;
		int[] num = new int[100];
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d\n",max(num, n));
		System.out.printf("%d\n",max(num + 1, n - 1));
	}

}

