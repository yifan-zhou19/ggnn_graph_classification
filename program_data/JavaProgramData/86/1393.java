package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int[] t = new int[100];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				t[i] = 60;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m[i] = Integer.parseInt(tempVar2);
				}
				for (int j = 0;j < m[i];j++)
				{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a = Integer.parseInt(tempVar3);
						}
						if (t[i] - a - 3 >= 0)
						{
						t[i] -= 3;
						}
						if (t[i] - a >= 0 && t[i] - a < 3)
						{
						t[i] = a;
						}
				}
		}
		for (int i = 0;i < n - 1;i++)
		{
				System.out.printf("%d\n",t[i]);
		}
		System.out.printf("%d",t[n - 1]);
		return 0;
	}
}

