package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int s;
		int t;
		int m;
		int[] a = new int[6];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;;i++)
	{
		a[i] = m % 10;
			m = m / 10;
		if (m < 1)
		{
				break;
		}
	}
	for (s = 0;s < i;s++)
	{
		t = a[s],a[s] = a[i - 1 - s],a[i - 1 - s] = t;
	}
		 for (s = 0;s <= i;s++)
		 {
		 System.out.printf("%d",a[s]);
		 }
	}
}

