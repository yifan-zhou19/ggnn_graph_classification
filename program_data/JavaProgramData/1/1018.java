package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int f(int a,int b)
	{
		int i;
		for (i = a;i * i <= b;i++)
		{
			if (b % i == 0)
			{
				t++;
				f(i, b / i);
			}
		}
	return t;
	}
	public static void Main()
	{
		int n;
		int i;
		int[] result = new int[1000];
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			t = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			result[i] = f(2, a[i]);

		}
	 for (i = 0;i < n;i++)
	 {
		System.out.printf("%d\n",result[i]);
	 }
	}


}

