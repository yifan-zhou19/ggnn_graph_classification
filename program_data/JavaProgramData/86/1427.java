package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] t = new int[60];
		int i;
		int j;
		int[] p = new int[1000];
		int a;
		int ms;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				p[i] = 60;
			}
			else
			{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				ms = t[j] + 3 * j;
				if (ms >= 60)
				{

					p[i] = 60 - 3 * j;
					break;
				}
				else if (ms < 60 && ms>57)
				{
					p[i] = 60 - (3 * j + 60 - ms);
					break;
				}
				else
				{
					p[i] = 60 - (3 * (j + 1));
				}
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",p[i]);
		}

		return 0;

	}

}

