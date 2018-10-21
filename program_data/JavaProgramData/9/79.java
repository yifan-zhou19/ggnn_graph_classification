package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] age = new int[100];
		int i;
		int j;
		int m = 0;
		int p;
		int h;
		char[][] hao = new char[100][10];
		String mid = new String(new char[10]);
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
				hao[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 60)
			{
				m = m + 1;
				for (j = i;j >= m;j--)
				{
					mid = hao[j];
					hao[j] = hao[j - 1];
					hao[j - 1] = mid;
					h = age[j];
					age[j] = age[j - 1];
					age[j - 1] = h;
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (age[j] < age[j + 1])
				{
					mid = hao[j];
					hao[j] = hao[j + 1];
					hao[j + 1] = mid;
					h = age[j];
					age[j] = age[j + 1];
					age[j + 1] = h;
				}
			}
		}


		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",hao[i]);
		}
	}
}

