package <missing>;

public class GlobalMembers
{
	public static int f(int k)
	{
		if (k == 1 || k == 2)
		{
			return 1;
		}
		else
		{
			return f(k - 1) + f(k - 2);
		}
	}
	public static int Main()
	{
		int[] s = new int[1000];
		int i;
		int n;
		int k;
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
				s[i] = Integer.parseInt(tempVar2);
			}
			k = s[i];
			System.out.printf("%d\n",f(k));
		}
		return 0;
	}
}

