package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int ans;
		int[] a = new int[100];
		int[] f = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		}

		ans = 1;
		for (i = 1;i <= n;i++)
		{
		   f[i] = 1;
		   for (j = 1;j < i;j++)
		   {
			  if ((a[j] >= a[i]) && (f[j] + 1 > f[i]))
			  {
				f[i] = f[j] + 1;
			  }
		   }
		   if (f[i] > ans)
		   {
			 ans = f[i];
		   }
		}

		System.out.printf("%d",ans);

		return 0;
	}

}

