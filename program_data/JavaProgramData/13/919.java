package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int[] a = new int[20001];
	int t;
	int i;
	int m;
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
	for (i = 0;i < n;i++)
	{
		m = 1;
		for (t = 0;t < i;t++)
		{
			if (a[i] == a[t])
			{
				m = 0;
			}
		}
		if (m == 1)
		{
		 if (i > 0)
		 {
		 System.out.print(" ");
		 }
		 System.out.printf("%d",a[i]);

		}

	}
	}
}

