package <missing>;

public class GlobalMembers
{
		public static int[] a = new int[300];
		public static int m;
		public static int n;
		public static int i = 0;
		public static int s;
	public static int max()
	{
		int k;
		int j;
		k = a[0];
		for (j = 1;j <= i;j++)
		{
			if (a[j] > k)
			{
				k = a[j];
			}
		}
		return k;
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (System.in.read() == ',')
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		m = max();
		for (s = 0;s <= i;s++)
		{
			if (a[s] == m)
			{
				a[s] = -1;
			}
		}
		n = max();
		if (n != -1)
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.print("No");
		}
	}

}

