package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[20];
		int n;
		int i;
		int j;
		int a;
		f[0] = 1;
		f[1] = 1;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				System.out.print("1");
			}
			else
			{
				for (j = 0;j + 2 < a;j++)
				{
				f[j + 2] = f[j] + f[j + 1];
				}
				System.out.printf("%d\n",f[a - 1]);
			}
		}
		System.in.read();
		System.in.read();
	}
}

