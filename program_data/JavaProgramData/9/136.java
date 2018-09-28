package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] age = new int[100];
		int[] dengji = new int[100];
		int p;
		int t;
		char[][] id = new char[100][10];
		char c;
		int jishuqi = 0;
		int k;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			dengji[i] = i;
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - 2 - i;j++)
			{
				if (age[j] < age[j + 1])
				{
					t = age[j];
					age[j] = age[j + 1];
					age[j + 1] = t;
					k = dengji[j];
					dengji[j] = dengji[j + 1];
					dengji[j + 1] = k;
					for (p = 0;p <= 9;p++)
					{
					  c = id[j][p];
					  id[j][p] = id[j + 1][p];
					  id[j + 1][p] = c;
					}
				}
				if (age[j] == age[j + 1])
				{
					if (dengji[j] > dengji[j + 1])
					{
						k = dengji[j];
						dengji[j] = dengji[j + 1];
						dengji[j + 1] = k;
						for (p = 0;p <= 9;p++)
						{
						   c = id[j][p];
						   id[j][p] = id[j + 1][p];
						   id[j + 1][p] = c;
						}
					}
				}
			}
		}
		 for (i = 0;i <= n - 2;i++)
		 {
			 for (j = 0;j <= n - 2 - i;j++)
			 {
				 if (age[j] < 60)
				 {
					 if (dengji[j] > dengji[j + 1])
					 {
						k = dengji[j];
						dengji[j] = dengji[j + 1];
						dengji[j + 1] = k;
						t = age[j];
						age[j] = age[j + 1];
						age[j + 1] = t;
						for (p = 0;p <= 9;p++)
						{
						   c = id[j][p];
						   id[j][p] = id[j + 1][p];
						   id[j + 1][p] = c;
						}
					 }
				 }
			 }
		 }
			 for (i = 0;i <= n - 1;i++)
			 {
				 System.out.printf("%s\n",id[i]);
			 }
	}

}

