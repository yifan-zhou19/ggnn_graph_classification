package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[max];
		int[] b = new int[max];
		int c = 0;
		int d = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c++;


			if (c >= d)
			{
				d = c;
			}
			}
			else
			{
				c = 0;

			}
		}
		System.out.printf("%d",d);
		return 0;
	}




}

