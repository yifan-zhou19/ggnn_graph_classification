package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] j = new int[100];
		int[][] s = new int[100][2];
		int l = 0;
		int max = 0;
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
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (s[i][0] <= 140 && s[i][0] >= 90 && s[i][1] <= 90 && s[i][1] >= 60)
			{

				j[l]++;
				if (s[i + 1][0] > 140 || s[i + 1][0] < 90 || s[i + 1][1]>90 || s[i + 1][1] < 60)
				{
					l++;

				}
			}

		}
		if (s[n - 2][0] <= 140 && s[n - 2][0] >= 90 && s[n - 2][1] <= 90 && s[n - 2][1] >= 60)
		{
			if (s[n - 1][0] <= 140 && s[n - 1][0] >= 90 && s[n - 1][1] <= 90 && s[n - 1][1] >= 60)
			{
				j[l]++;
			}
		}

		else
		{
			if (s[n - 1][0] <= 140 && s[n - 1][0] >= 90 && s[n - 1][1] <= 90 && s[n - 1][1] >= 60)
			{
				j[l] = 1;
			}
		}


		for (i = 0;i < l + 1;i++)
		{
			if (j[i] > max)
			{
				max = j[i];
			}
		}
		System.out.printf("%d",max);



		return 0;
	}

}

