package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int d;
		int[] s = new int[1000];
		int[] c = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			c[0] = 0;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   d = Integer.parseInt(tempVar3);
		   }
		   if (b >= 90 && b <= 140 && d >= 60 && d <= 90)
		   {
			   s[a] = 1;
			   c[a + 1] = c[a] + s[a];
		   }
		   else
		   {
			   s[a] = 0;
			   c[a + 1] = 0;
		   }
		}
		int e;
		int k;
		int i;
		for (i = 1;i <= a + 1;i++)
		{
			for (k = 0;k < a + 1 - i;k++)
			{
				if (c[k] > c[k + 1])
				{
					e = c[k];
					c[k] = c[k + 1];
					c[k + 1] = e;
				}
			}
		}
		System.out.printf("%d",c[a]);
		return 0;
	}
}

