package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int q;
		int t = 0;
		int p = 0;
		int[] a = new int[500];
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

		if (n == 1)
		{
		 System.out.printf("%d",a[0]);
		}

		else
		{
		 System.out.printf("%d",a[0]);
	   for (i = 1;i < n;i++)
	   {
		   t = 0;
		   for (q = 0;q < i;q++)
		   {
			if (a[i] != a[q])
			{
			t++;
			}
		   }
		  if (t == i)
		  {
			 System.out.printf(",%d",a[i]);
		  }
	   }
		}

	}

}

