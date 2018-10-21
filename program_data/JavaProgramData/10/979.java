package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int[] b = new int[10000];
	public static int n;
	public static int m = 0;
	public static int p = 1;
	public static void dao(int c,int k)
	{
		 int i;
		 int flag = 0;
		 for (i = k + 1;i < n;i++)
		 {
						   if (a[i] <= c)
						   {
										flag = 1;
										p = p + 1;
										dao(a[i], i);
										p = p - 1;
						   }
		 }
		 if (flag == 0)
		 {
					b[m] = p;
					m = m + 1;
		 }
	}
	public static int Main()
	{
		int i;
		int q;
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
						dao(a[i], i);
		}
		for (i = 0;i < m - 1;i++)
		{
						  if (b[i] > b[i + 1])
						  {
										 q = b[i];
										 b[i] = b[i + 1];
										 b[i + 1] = q;
						  }
		}
		System.out.printf("%d",b[m - 1]);

		return 0;
	}



}

