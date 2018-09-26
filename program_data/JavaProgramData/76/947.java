package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int c = 0;
		int n;
		int i;
		int e;
		int f;
		int j;
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
		}
		e = a[0];
		f = b[0];
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
			if (a[j] <= e != 0 && b[j] >= f)
			{
				e = a[j];
				f = b[j];
			}
			if (a[j] >= e != 0 && a[j] <= f != 0 && b[j] >= f)
			{
				f = b[j];
			}
			if (a[j] >= e != 0 && b[j] <= f)
			{
				e = e;
				f = f;
			}
			if (a[j] <= e != 0 && b[j] <= f != 0 && b[j] >= e)
			{
				e = a[j];
			}
			if (b[i] == e)
			{
				e = a[j];
			}
			if (a[i] == f)
			{
				f = b[j];
			}
			}

		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > f || b[i] < e || a[i] < e || b[i]> f)
			{
				c++;
			}
		}
		if (c == 0)
		{
			System.out.printf("%d %d",e,f);
		}
		if (c != 0)
		{
			System.out.print("no");
		}








		return 0;


	}

}

