package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		a[0] = 1;
		a[1] = 1;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
		   int k;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   k = Integer.parseInt(tempVar2);
		   }
		   for (int i = 2;i < k;i++)
		   {
		   a[i] = a[i - 1] + a[i - 2];
		   }
		   System.out.printf("%d\n",a[k - 1]);
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

