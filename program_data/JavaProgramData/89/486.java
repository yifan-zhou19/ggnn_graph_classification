package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int j;
		int t = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		for (i = 0;;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b[i] = Integer.parseInt(tempVar3);
						 }
						 if (a[i] == 0 && b[i] == 0)
						 {
						 break;
						 }
		}
		m = i;
		for (i = 0;i < n;i++)
		{
			int f = 0;
						for (j = 0;j < m;j++)
						{
						   if (i == a[j])
						   {
							  f = 1;
						   break;
						   }
						}
						if (f == 0)
						{
						int p = 0;
						for (j = 0;j < m;j++)
						{
										if (i == b[j])
										{
										p++;
										}
						}
						if (p == n - 1)
						{
								System.out.printf("%d\n",i);
								q = 1;
						}
						}
		}
		if (q == 0)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
	}
}

