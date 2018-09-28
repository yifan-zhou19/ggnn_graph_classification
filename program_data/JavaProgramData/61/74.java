package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[21];
		a[1] = 1;
		a[2] = 1;
		for (int i = 3;i <= 20;i++)
		{
		a[i] = a[i - 1] + a[i - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[n];
		for (int i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[n] = Integer.parseInt(tempVar2);
		   }
		System.out.printf("%d\n",a[b[n]]);
		}
		System.in.read();
		System.in.read();
	}

}

