package <missing>;

public class GlobalMembers
{
	public static int bj(Object x, Object y)
	{
		if ((int)x > (int)y)
		{
			return 1;
		}
		if ((int)x < (int)y)
		{
			return -1;
		}
		if ((int)x == (int)y)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[1000];
		int pds = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		qsort(a,n,4,bj);
		for (i = 0;i < n - 1;i++)
		{
			 for (j = n - 1;j > i;j--)
			 {
				  if (a[i] + a[j] < k)
				  {
					  break;
				  }
				  else if (a[i] + a[j] == k)
				  {
					  pds = 1;
					  break;
				  }
			 }
			 if (pds == 1)
			 {
				 break;
			 }
		}
		if (pds == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

	}

}

