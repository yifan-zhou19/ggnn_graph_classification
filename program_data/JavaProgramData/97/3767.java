package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int[] sz = new int[6];
		int[] rmb = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		rmb[0] = 100;
		rmb[1] = 50;
		rmb[2] = 20;
		rmb[3] = 10;
		rmb[4] = 5;
		rmb[50] = 1;
		for (i = 0;i < 5;i++)
		{
			sz[i] = a / rmb[i];
			a = a - sz[i] * rmb[i];
		}
		 for (i = 0;i < 5;i++)
		 {
			 System.out.printf("%d\n",sz[i]);
		 }
		 System.out.printf("%d\n",a);
	}
}

