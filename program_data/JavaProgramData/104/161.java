package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int[] ai = new int[500];
		int[] bi = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int i;
		ai[0] = a;
		bi[0] = b;
		int a_n = 0;
		int b_n = 0;
		for (i = 0;ai[i] != 0;i++)
		{
			ai[i + 1] = ai[i] / 2;
			a_n++;
		}
		for (i = 0;bi[i] != 0;i++)
		{
			bi[i + 1] = bi[i] / 2;
			b_n++;
		}
		int eq = 0;
		int j;
		for (i = 0;i < a_n;i++)
		{
			for (j = 0;j < b_n;j++)
			{
				if (ai[i] == bi[j])
				{
					eq = ai[i];
					break;
				}
			}
			if (eq != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",eq);
	}
}

