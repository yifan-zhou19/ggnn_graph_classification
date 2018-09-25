package <missing>;

public class GlobalMembers
{
	public static int count = 0;
	public static int[] a = new int[25];
	public static int n;
	public static int d = 0;
	public static int h;
	public static int k = 0;
	public static void f()
	{
		int i;
		int temp = count;
		int temph = h;
		for (i = k;i < n;i++)
		{
			if (a[i] <= h)
			{
			h = a[i];
			k = i + 1;
			count++;
			d = count > d != 0?count:d;
			f();
			count = temp;
			h = temph;
			}
		}
	}



	public static void Main()
	{
		int i;
		int j;
		int k;
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
		h = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > h)
			{
				h = a[i];
			}
		}
		f();
		System.out.printf("%d",d);
	}

}

