package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int[][] ew = new int[100][2];
		int[] z = new int[100];
		int[] s = new int[100];
		int i;
		int j;
		int k = 0;
		int max = 0;
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
				ew[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ew[i][1] = Integer.parseInt(tempVar3);
			}
			if (((ew[i][0] <= 140) && (ew[i][0] >= 90)) && ((ew[i][1] <= 90) && (ew[i][1] >= 60)))
			{
				z[i] = 1;
			}
			else
			{
				z[i] = 0;
			}


		}
	//	for(i=0;i<=n-1;i++){
	//		printf("%d",z[i]);
	//	}
		s[0] = 0;
		for (i = 0;i <= n - 1;i++)
		{

			if (z[i] == 1)
			{
				s[k]++;
			}
			else
			{
				k++;
				s[k] = 0;
			}

		}
	//	printf("%d",s[1]);
		for (i = 0;i <= k;i++)
		{
			if (s[i] >= max)
			{
				max = s[i];
			}
		}
		System.out.printf("%d",max);


		return 0;
	}



}

