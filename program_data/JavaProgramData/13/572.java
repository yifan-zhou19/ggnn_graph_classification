package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int[] b = new int[100];
		int t = 1;
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
			for (j = 0;j < t;j++)
			{
			if (a[i] == b[j])
			{
				break;
			}
			}
			if (j >= t)
			{
			  b[t] = a[i];
			  t++;
			}
		}
		  for (j = 1;j < t - 1;j++)
		  {
		  System.out.printf("%d ",b[j]);
		  }
		  System.out.printf("%d",b[t - 1]);
	}

}

