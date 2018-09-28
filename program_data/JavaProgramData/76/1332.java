package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 1;
		int e;
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		for (int i = 0;i < n - 1;i++)
		{
		   for (int k = i + 1;k < n;k++)
		   {
			   if (a[i] > a[k])
			   {
				   e = a[i];
				   a[i] = a[k];
				   a[k] = e;
			   }
			   if (b[i] > b[k])
			   {
				   e = b[i];
				   b[i] = b[k];
				   b[k] = e;
			   }
		   }
		}
		for (int i = 0;i < n - 1;i++)
		{
			if (b[i] < a[i + 1])
			{
				m = 0;
			}
		}
		if (m == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		return 0;
	}

}

