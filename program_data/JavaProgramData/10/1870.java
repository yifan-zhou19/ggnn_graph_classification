package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x > y)
		{
			return x;
		}
	   else
	   {
		   return y;
	   }
	}

	public static int Main()
	{
		int[] a = new int[30];
	   int[] b = new int[30];
	   int i;
	   int j;
	   int n;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   }
	   for (i = 1;i <= n;i++)
	   {
	   b[i] = 1;
	   }

	   for (i = n - 1;i >= 1;i--)
	   {
		for (j = i + 1;j <= n;j++)
		{
		  if (a[i] >= a[j])
		  {
		  b[i] = max(b[i], b[j] + 1);
		  }
		}

	   }
	t = b[1];
	for (i = 2;i <= n;i++)
	{
	t = max(t, b[i]);
	}
	System.out.printf("%d",t);
	System.in.read();
	System.in.read();
	}

}

