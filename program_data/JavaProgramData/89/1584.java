package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] in = new int[SIZE];
	public static int[] out = new int[SIZE];

	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			in[i] = out[i] = 0;
		}
		int a = 1;
		int b;
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a == 0) && (b == 0))
			{
				break;
			}
			out[a]++;
			in[b]++;
		}
		for (i = 0;i < n;i++)
		{
			if ((in[i] == n - 1) && (out[i] == 0))
			{
				System.out.printf("%d\n",i);
				return 0;
			}
		}
	}
}

