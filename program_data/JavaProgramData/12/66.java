package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[10000];
		int[] m = new int[15];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int k = 0;
		int total;
		int all = 0;
		int sum = 0;
		int q;
		int t;
		p = n[0];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			if (n[i] == 0)
			{
				all++;
			}
			if (n[i] == -1)
			{
				break;
			}
		}
		while (all > 0)
		{
			for (i = 0,t = 0;n[k] != 0;i++,k++)
			{
				m[i] = n[k];
				t++;
			}
			k = k + 1;
			total = 0;
			for (q = 0;q < t;q++)
			{
				for (j = 0;j < t;j++)
				{
					if ((m[q] / m[j] == 2) && (m[q] % m[j] == 0))
					{
						total++;
					}
				}
			}
			System.out.printf("%d\n",total);
			all--;
		}
		return 0;
	}
}

