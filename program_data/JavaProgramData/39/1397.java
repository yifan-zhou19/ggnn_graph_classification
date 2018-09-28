package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int[][] x = new int[100][3];
		int i;
		int[] total = new int[100];
		int[] T = new int[100];
		int s = 0;
		int k;
		char[][] y = new char[100][2];
		char[][] z = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i][0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				x[i][1] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				y[i][0] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				y[i][1] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				x[i][2] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (x[i][0] > 80 && x[i][2] > 0)
			{
				total[i] = total[i] + 8000;
			}
			if (x[i][0] > 85 && x[i][1] > 80)
			{
				total[i] = total[i] + 4000;
			}
			if (x[i][0] > 90)
			{
				total[i] = total[i] + 2000;
			}
			if (x[i][0] > 85 && y[i][1] == 'Y')
			{
				total[i] = total[i] + 1000;
			}
			if (x[i][1] > 80 && y[i][0] == 'Y')
			{
				total[i] = total[i] + 850;
			}
			s = s + total[i];
		}
		for (i = 0;i < N;i++)
		{
			T[i] = total[i];
		}
		for (i = 0;i < N - 1;i++)
		{
			if (T[i] > T[i + 1])
			{
				k = T[i];
				T[i] = T[i + 1];
				T[i + 1] = k;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (total[i] == T[N - 1])
			{
				System.out.printf("%s\n",z[i]);
				System.out.printf("%d\n",total[i]);
				System.out.printf("%d",s);
				break;
			}
		}
	}
}

