package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int n;
		int i;
		double k;
	   int[] a = new int[500];
	   int[] b = new int[500];
	   int s;
	   int e;
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
	   s = a[0];
	   e = b[0];
		for (i = 0;i < n;i++)
		{
		   if (a[i] < s)
		   {
			   s = a[i];
		   }
		   else if (b[i] > e)
		   {
			   e = b[i];
		   }
		}
		for (k = s;k <= e;k += 0.5)
		{
			for (i = 0;i < n;i++)
			{
				if (k >= a[i] != 0 && b[i] >= k)
				{

					break;
				}
				else if (i == n - 1)
				{
					System.out.print("no");
					return 0;
				}

			}
			if (k == e)
			{
				System.out.printf("%d %d",s,e);
			}
		}


		return 0;

	}
}

