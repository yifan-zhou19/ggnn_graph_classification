package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] inp = new int[MAX];
	public static int[] oup = new int[MAX];
	public static int i;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				inp[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			oup[i] = inp[n - 1 - i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",oup[i]);
		}
		System.out.printf("%d",oup[n - 1]);
		return 0;
	}

}

