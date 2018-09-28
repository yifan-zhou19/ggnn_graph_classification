package <missing>;

public class GlobalMembers
{
	public static int judge(int[] a, int c, int b)
	{
		int i;
		int flag = 1;
		for (i = 0;i < b;i++)
		{
			if (c == a[i])
			{
				flag = 0;
			}
		}
		return (flag);
	}
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 0;
		k = 0;
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
			if (judge(a, a[i], i) == 1)
			{
				b[k] = a[i];
				k++;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}

}

