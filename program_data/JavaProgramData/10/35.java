package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[99];
	public static void Main()
	{
		int f = new int(int,int,int);
		int i;
		int max;
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
		max = f(99999, 0, 0);
		System.out.printf("%d\n",max);
	}
	public static int f(int hi,int num,int i)
	{
		int t1;
		int t2;
		while (a[i] > hi)
		{
			i++;
		}
		if (i >= n)
		{
			return num;
		}
		t1 = f(hi, num, i + 1);
		t2 = f(a[i], num + 1, i + 1);
		return t1 > t2 != 0?t1:t2;
	}

}

