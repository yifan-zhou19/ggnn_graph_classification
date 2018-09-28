package <missing>;

public class GlobalMembers
{
	public static void px(int[] a, int n)
	{
		int i;
		int j;
		int k;
		int t;
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
		if (a[i] < a[j])
		{
		t = a[i];
	a[i] = a[j];
	a[j] = t;
		}
	}
	}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int l;
		int s = 0;
		int t = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		int f = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		if (System.in.read() != ',')
		{
			break;
		}
		}
		px(a, i + 1);
		for (j = 1;j <= i;j++)
		{
			if (a[j] < a[0])
			{
				System.out.printf("%d",a[j]);
				f = 1;
				break;
			}
		}
			if (f == 0)
			{
			System.out.print("No");
			}
	}
}

