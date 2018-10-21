package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		int j;
		int again;
		int max;
		String a = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		x = a.length();
		int sum = x + 1 - n;
		int[] number = new int[sum];
		char[][] temp = new char[x + 1 - n][n + 1];
		for (i = 0;i < x + 1 - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				temp[i][j] = a.charAt(i + j);
			}
			temp[i][n] = '\0';
		}
		for (i = 0;i < sum;i++)
		{
			number[i] = 0;
		}
		number[0] = 1;
		for (i = 1;i < sum;i++)
		{
			again = 0;
			for (j = 0;j < i;j++)
			{
				if (strcmp(temp[i],temp[j]) == 0)
				{
					number[j]++;
					again = 1;
					break;
				}
			}
			if (again == 0)
			{
				number[i]++;
			}
		}
		max = number[0];
		for (i = 1;i < sum;i++)
		{
			if (number[i] > max)
			{
				max = number[i];
			}
		}
		if (max != 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < sum;i++)
			{
				if (number[i] == max)
				{
					System.out.printf("%s\n",temp[i]);
				}
			}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}

}

