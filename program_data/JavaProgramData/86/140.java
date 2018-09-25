package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int[] a = new int[100];
		  int n;
		  int i;
		  int j;
		  int t;
		  int p;
		  int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i] = Integer.parseInt(tempVar3);
			  }
		}


			   t = m * 3 + a[m - 1];
			   p = (m - 1) * 3 + a[m - 2];
			   q = (m - 2) * 3 + a[m - 3];
			   if (t <= 60)
			   {
				   System.out.printf("%d\n",a[m - 1] + (60 - t));
			   }
			   else if (t > 60 && p <= 60 && (a[m - 1] - a[m - 2]) >= (60 - p))
			   {
				   System.out.printf("%d\n",a[m - 2] + (60 - p));
			   }
			else if (t > 60 && p <= 60 && (a[m - 1] - a[m - 2]) < (60 - p))
			{
				System.out.printf("%d\n",a[m - 1]);
			}
			   else if (p > 60 && q <= 60 && (a[m - 2] - a[m - 3]) >= (60 - q))
			   {
				   System.out.printf("%d\n",a[m - 3] + (60 - q));
			   }
			   else if (p > 60 && q <= 60 && (a[m - 2] - a[m - 3]) < (60 - q))
			   {
				   System.out.printf("%d\n",a[m - 2]);
			   }


		}
		return 0;
	}
}

