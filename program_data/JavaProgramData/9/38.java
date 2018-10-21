package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] id = new char[NUM][LEN];
		int[] nl = new int[NUM];
		char[][] id_old = new char[NUM][LEN];
		char[][] id_young = new char[NUM][LEN];
		int[] nl_old = new int[NUM];
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String ids = new String(new char[LEN]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				nl[i] = Integer.parseInt(tempVar3);
			}
			if (nl[i] >= 60)
			{
				id_old[a] = id[i];
				nl_old[a] = nl[i];
				a++;
			}
			else
			{
				id_young[b] = id[i];
				b++;
			}
		}
		int e;
		for (i = 1;i <= a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (nl_old[j] < nl_old[j + 1])
				{
					e = nl_old[j + 1];
					nl_old[j + 1] = nl_old[j];
					nl_old[j] = e;
					ids = id_old[j + 1];
					id_old[j + 1] = id_old[j];
					id_old[j] = ids;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%s\n",id_old[i]);
		}
		for (i = 0;i < b;i++)
		{
			System.out.printf("%s\n",id_young[i]);
		}
		return 0;
	}
}

