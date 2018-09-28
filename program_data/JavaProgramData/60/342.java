package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int t;
		int l;
		int m;
		int n;
		int k;
		int s = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 2;t <= n;t++)
		{
						 k = (int)Math.sqrt(t);
						 for (m = 2;m <= k;m++)
						 {
						   if (t % m == 0)
						   {
						   break;
						   }
						 }
						   if (m == k + 1)
						   {
						   a[i] = t;
						   i = i + 1;
						   }
		}
		l = i;
		for (i = 0;i < l;i++)
		{
							 if (a[i + 1] - a[i] == 2)
							 {
							 System.out.printf("%d %d\n",a[i],a[i + 1]);
							 s = s + 1;
							 }
		}
							 if (s == 0)
							 {
							 System.out.print("empty\n");
							 }

	}
}

