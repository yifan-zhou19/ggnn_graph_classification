package <missing>;

public class GlobalMembers
{
	public static int F(int a)
	{
		int result;
		if (a == 1 || a == 2)
		{
			return 1;
		}
		else
		{
			result = F(a - 1) + F(a - 2);
			return result;
		}
	}

	public static int Main()
	{
		int n;
		int[] in = new int[21];
		int[] out = new int[21];
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
				in[i] = Integer.parseInt(tempVar2);
			}
			out[i] = F(in[i]);
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",out[i]);
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

