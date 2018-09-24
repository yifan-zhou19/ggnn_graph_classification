package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		float p = 0F;
		float m;
		float w;
		float q;
		int[] a = new int[300];
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
			p = p + a[i];
		}
		m = (p / n);
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
			   if (a[i] > a[i + 1])
			   {
				  t = a[i];
				  a[i] = a[i + 1];
				  a[i + 1] = t;
			   }
			}
		}
		w = m - a[0];
		q = a[n - 1] - m;
		if (w == q)
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		else if (w < q)
		{
			System.out.printf("%d",a[n - 1]);
		}
			 else
			 {
				 System.out.printf("%d",a[0]);
			 }
	}

}

