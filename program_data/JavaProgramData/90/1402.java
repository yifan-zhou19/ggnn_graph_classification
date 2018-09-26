package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a < 1 || b < 1)
		{
		return 0;
		}
		if (a == 1 || b == 1)
		{
		return 1;
		}
			if (a < b)
			{
			return max(a, a);
			}
			if (a == b)
			{
				return (max(a, b - 1) + 1);
			}
			if (a > b)
			{
			return (max(a - b, b) + max(a, b - 1));
			}
	}
	public static int Main()
	{
		int t;
		int[] a = new int[20];
		int[] b = new int[20];
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
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
		}
		 for (i = 0;i < t;i++)
		 {
			m = max(a[i], b[i]);
			System.out.printf("%d\n",m);
		 }
	}



}

