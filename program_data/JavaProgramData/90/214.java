package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int[] m = new int[20];
	public static int[] n = new int[20];
	public static int[] ans = new int[20];
	public static int i;

	public static int count(int a, int p)
	{
		int answer;
		if (p == 1 || a == 0)
		{
			return 1;
		}
		if (a < p)
		{
			return count(a, a);
		}
		else
		{
			return (count(a, p - 1) + count(a - p, p));
		}
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
				ans[i] = count(m[i], n[i]);
		}
		for (i = 0;i < n1;i++)
		{
			System.out.printf("%d\n",ans[i]);
		}
		return 0;
	}


}

