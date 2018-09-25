package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int h = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
						 if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
						 {
							 m = m + 1;
							 if (h < m)
							 {
								 h = m;
							 }
						 }
						 else
						 {
							 if (h < m)
							 {
								 h = m;
							 }
							  m = 0;
						 }
		}
	   System.out.printf("%d",h);
	return 0;
	}

}

