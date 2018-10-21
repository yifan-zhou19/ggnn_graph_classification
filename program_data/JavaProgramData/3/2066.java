package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   int m;
	   int[] a = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
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
		for (i = 0;i < n;i++)
		{
			m = k - a[i];
			for (j = 0;j < n;j++)
			{
				if (j == i)
				{
					continue;
				}
				if (a[j] == m)
				{
				System.out.print("yes");
				break;
				}
			}
			 if (a[j] == m)
			 {
			 break;
			 }
		}
		if (i == n && j == n)
		{
		System.out.print("no");
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;

	}
}

