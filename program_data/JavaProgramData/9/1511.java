package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] age = new int[100];
		int i;
		int j;
		int k = 0;
		int e0;
		int m;
		int a;
		int[] AGE = new int[100];
		char[][] id = new char[100][10];
		char[][] ID = new char[100][10];
		char[][] e = new char[100][10];
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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		m = String.valueOf(id[0]).length();
		for (i = 0;i < n;i++)
		{
			id[i][m] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 60)
			{
				for (a = 0;a <= m;a++)
				{
					ID[k][a] = id[i][a];
				}
				AGE[k] = age[i];
				k++;
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (AGE[j] < AGE[j + 1])
				{
			e0 = AGE[j + 1];
			AGE[j + 1] = AGE[j];
			AGE[j] = e0;
			for (a = 0;a <= m;a++)
			{
				e[0][a] = ID[j + 1][a];
				ID[j + 1][a] = ID[j][a];
				ID[j][a] = e[0][a];
			}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
				for (a = 0;a <= m;a++)
				{
					ID[k][a] = id[i][a];
				}
				k++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",ID[i]);
		}
		return 0;
	}
}

