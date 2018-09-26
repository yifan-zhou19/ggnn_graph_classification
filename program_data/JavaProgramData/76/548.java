package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int n;
	public static int l;
	public static int r;
	public static int flag = 1;
	public static int minleft;
	public static int maxright;
	public static int[] b = new int[20000];
	public static int Main()
	{
		minleft = 50001;
		maxright = 0;
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
				l = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				r = Integer.parseInt(tempVar3);
			}
			if (l <= minleft)
			{
				minleft = l;
			}
			if (r >= maxright)
			{
				maxright = r;
			}
			for (j = l;j < r;j++)
			{
				b[j] = 1;
			}
		}
		for (k = minleft;k <= maxright - 1;k++)
		{
		if (b[k] == 0)
		{
		flag = 0;
		break;
		}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",minleft,maxright);
		}
		return 0;
	}

}

