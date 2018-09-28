package <missing>;

public class GlobalMembers
{
	public static int yuesefu(int[] a, int sum, int k)
	{
		int i;
		int j;
		int count;
		for (count = 0,i = 0,j = 0;count < sum - 1;)
		{
			if (a[i] != 0)
			{
				j++;
			}
			if (j == k)
			{
				a[i] = 0;
				count++;
				j = 0;
			}
			i++;
			if (i == sum)
			{
				i = 0;
			}
		}
		for (i = 0;i < sum;i++)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		return a[i];
	}
	public static void ascanf(int[] a, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
	}
	public static int Main()
	{
		int[][] a = new int[100][300];
		int[][] p = new int[100][2];
		int i;
		int j;
		int num = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i][1] = Integer.parseInt(tempVar2);
			}
			num++;
			if (p[i][0] == 0 && p[i][1] == 0)
			{
				break;
			}
		}
		for (i = 0;i < num;i++)
		{
			ascanf(a[i], p[i][0]);
		}
		for (i = 0;i < num - 1;i++)
		{
			System.out.printf("%d\n",yuesefu(a[i], p[i][0], p[i][1]));
		}

		return 0;
	}


}

