package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] q = new int[5000];
		int[] h = new int[5000];
		int star = 0;
		int end = 0;
		int i;
		int a;
		int k;
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
				q[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (q[i] > q[i + 1])
				{
				e = q[i + 1];
				q[i + 1] = q[i];
				q[i] = e;
				e = h[i + 1];
				h[i + 1] = h[i];
				h[i] = e;
				}

			}
		}
	   star = q[0];
	   end = h[0];
		for (k = 0;k < n;k++)
		{
			if (h[0] >= q[k] != 0 && h[k] >= h[0])
			{
				end = h[k];
				h[0] = h[k];
			}
		}

		 for (a = 0;a < n - 1;a++)
		 {
				  if (h[a] > h[a + 1])
				  {
					  h[a + 1] = h[a];
				  }
		 }
		 if (end == h[n - 1])
		 {
		 System.out.printf("%d %d",star,end);
		 }
		 else
		 {
			 System.out.print("no");
		 }
		 return 0;
	}
}

