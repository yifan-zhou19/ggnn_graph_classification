package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int e = 0;
		int f = 0;
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
		if (e <= a[i])
		{
		e = a[i];
		}

		}
		for (i = 0;i < n;i++)
		{
		if (f <= a[i])
		{
		 if (a[i] == e)
		 {
		  continue;
		 }
		  f = a[i];
		}
		}
		System.out.printf("%d\n%d\n",e,f);
		return 0;
	}

}

