package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int[] N = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				N[a] = Integer.parseInt(tempVar2);
			}
		}
		int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 2;i < 20;i++)
		{
			f[i] = f[i - 2] + f[i - 1];
		}
		for (a = 0;a <= n - 1;a++)
		{
			b = N[a] - 1;
		System.out.printf("%d\n",f[b]);
		}
		return 0;
	}

}

