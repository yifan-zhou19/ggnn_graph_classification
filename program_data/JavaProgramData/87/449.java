package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[0] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[1] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[2] = Integer.parseInt(tempVar6);
			}
		int n;
		int m;
		n = 3600 * a[0] + 60 * a[1] + a[2];
		m = 3600 * (b[0] + 12) + 60 * b[1] + b[2];
		if ((b[2] + b[1] + b[0] + a[0] + a[1] + a[2]) != 0)
		{
			System.out.printf("%d\n",m - n);
		}
		}while ((b[2] + b[1] + b[0] + a[0] + a[1] + a[2]) != 0);
		return 0;


	}
}

