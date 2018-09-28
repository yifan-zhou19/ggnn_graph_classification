package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
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
		}
		for (int t = n - 1;t >= 0;t--)
		{
		   if (t > 0)
		   {
			   System.out.printf("%d ",a[t]);
		   }
		   else
		   {
			   System.out.printf("%d",a[t]);
		   }
		}
		return 0;
	}
}

