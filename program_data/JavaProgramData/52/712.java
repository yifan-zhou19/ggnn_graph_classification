package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shu = new int[200];
		int n;
		int m;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		  for (i = 0;i < n;i++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			shu[i] = a;
		  }
		  for (i = 100;i < 100 + m;i++)
		  {
			shu[i] = shu[n - m + i - 100];
			System.out.printf("%d ",shu[i]);
		  }
		  for (i = 100;i < 100 + n - m - 1;i++)
		  {
			shu[m + i] = shu[i - 100];
			System.out.printf("%d ",shu[m + i]);
		  }
		System.out.printf("%d\n",shu[n - m - 1]);
		return 0;
	}



}

