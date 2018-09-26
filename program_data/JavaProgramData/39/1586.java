package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int i;
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int[] scholar = new int[100];
		int x;
		int y;
		int sum;
		char[][] name = new char[100][20];
		char[][] condition = new char[100][7];
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
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num2[i] = Integer.parseInt(tempVar4);
			}
			condition[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < N;i++)
		{
			if ((num1[i] > 80) && (condition[i][5] != '0'))
			{
				scholar[i] += 8000;
			}
			if ((num1[i] > 85) && (num2[i] > 80))
			{
				scholar[i] += 4000;
			}
			if (num1[i] > 90)
			{
				scholar[i] += 2000;
			}
			if ((num1[i] > 85) && (condition[i][3] == 'Y'))
			{
				scholar[i] += 1000;
			}
			if ((num2[i] > 80) && (condition[i][1] == 'Y'))
			{
				scholar[i] += 850;
			}
		}
		sum = scholar[0];
		for (i = 1;i < N;i++)
		{
			if (scholar[i] > x)
			{
				x = scholar[i];
				y = i;
			}
			sum += scholar[i];
		}
		System.out.printf("%s\n%d\n%d", name[y], x, sum);
	}




}

