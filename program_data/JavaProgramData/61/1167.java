package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		int t;
		int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < 25;i++)
		{
		f[i] = f[i - 2] + f[i - 1];
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		b[i] = a - 1;
		}
		for (i = 0;i < n;i++)
		{
			t = b[i];
			System.out.printf("%d\n",f[t]);
		}
	}

}

