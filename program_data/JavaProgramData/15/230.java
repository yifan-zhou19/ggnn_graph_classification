package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k;
		int aj;
		int ai;
		int bi;
		int bj;
		int k1;
		int k2;
		int k3;
		aj = 0;
		ai = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				k1 = k2;
				k2 = k3;
				k3 = k;
				if (k3 == 0 && k2 == 0 && k1 == 255)
				{
					if (aj == 0)
					{
					aj = j;
					ai = i - 1;
					}
				}
				else if (k1 == 0 && k2 == 0 && k3 == 255)
				{
					bj = j;
					bi = i - 1;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.print(((bj - aj - 1) * (bi - ai - 1)));
		System.out.print("\n");
		return 0;
	}
}

