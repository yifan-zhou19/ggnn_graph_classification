package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] so = new int[100];
		int[] su = new int[100];
		int[] a = new int[102];
		int i;
		int d = 0;
		int c = 0;
		int[] b = new int[102];
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
				so[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				su[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (so[i] >= 90 && so[i] <= 140 && su[i] >= 60 && su[i] <= 90)
			{
				a[i + 1] = 1;
			}
		}
		a[n + 1] = 0;
		a[0] = 0;
		for (i = 0;i < n + 2;i++)
		{
			if (a[i] == 0)
			{
				b[c] = i - d - 1;
				d = i;
				c++;


			}
		}
		int max = b[0];
		for (i = 1;i < c;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}


}

