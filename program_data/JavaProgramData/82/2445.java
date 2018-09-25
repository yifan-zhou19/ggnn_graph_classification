package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] d = new int[100];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
		for (j = 0;j < n;j++)
		{
			d[j] = 0;
		}
		for (i = 0,j = 0;i < n;i++)
		{
						if (a[i] <= 140 && a[i] >= 90 && b[i] <= 90 && b[i] >= 60)
						{
							d[j]++;
						}
						else
						{
							j++;
						}
		}
		s = d[0];
		for (j = 0;j < n;j++)
		{
						   if (d[j] > s)
						   {
							   s = d[j];
						   }
		}
		System.out.printf("%d",s);

		return 0;
	}
}

