public class point
{
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int A;
		int B;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		point[] range = tangible.Arrays.initializeWithDefaultpointInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(range[i].a) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(range[i].b) = Integer.parseInt(tempVar3);
			}
		}
		A = range[0].a;
		B = range[0].b;
			for (k = 0;k < n;k++)
			{
		  for (i = 1;i < n;i++)
		  {
			if (!(A > range[i].b || B < range[i].a))
			{
				if (B < range[i].b)
				{
							   B = range[i].b;
				}
				if (A > range[i].a)
				{
				  A = range[i].a;
				}
			}
		  }
			}
		 for (i = 0;i < n;i++)
		 {
			  if (A > range[i].b || B < range[i].a)
			  {
				 j++;
			  }
		 }
		if (j == 0)
		{
			System.out.printf("%d %d",A,B);
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}

}

