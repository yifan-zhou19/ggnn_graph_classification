package <missing>;

public class GlobalMembers
{
	public static final String zimu = "ABCDEFGJIJKLMNOPQRSTUVWXYZ";
		public static char[][] writer = new char[10000][10000];
		public static int[] times = new int[26];
		public static int[] id = new int[1000];
		public static int i;
		public static int[] len = new int[10000];
		public static int book = 0;
		public static int n;
		public static int j;
		public static int k;
		public static int tmax;
		public static int max = 0;

	public static int Main()
	{

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
				id[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				writer[i] = tempVar3.charAt(0);
			}
			len[i] = String.valueOf(writer[i]).length();
		}
		for (i = 0;i < 26;i++)
		{
			times[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				for (k = 0;k < 26;k++)
				{

					if (writer[i][j] == zimu.charAt(k))
					{
						times[k]++;
					}
				}
			}

		}
		for (i = 0;i < 26;i++)
		{
			if (times[i] > max)
			{
			max = times[i];
			tmax = i;
			}
		}
		System.out.printf("%c\n",zimu.charAt(tmax));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (writer[i][j] == zimu.charAt(tmax))
				{
					book++;
				}
			}
		}
		System.out.printf("%d\n",book);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (writer[i][j] == zimu.charAt(tmax))
				{
					System.out.printf("%d\n",id[i]);
				}
			}
		}


		return 0;
	}
}

