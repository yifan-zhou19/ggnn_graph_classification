package <missing>;

public class GlobalMembers
{
	public static int ifsu(int i)
	{
		int temp = 0;
		int j;
		for (j = 2;j < i;j++)
		{
			if (i % j == 0)
			{
				temp++;
			}
		}
		if (temp == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int[] a = new int[5000];
		int time = 0;
		int i;
		int j;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 0;
		for (i = 2;i <= n;i++)
		{
			if (ifsu(i) == 1)
			{
			a[j] = i;
			time++;
			j++;
			}

		}

		for (i = 1;i < time-1;i++)
		{
			if (a[i] == (a[i + 1] - 2))
			{

			System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
			temp++;

		}
		if (temp == 0)
		{
			System.out.print("empty");
		}
	}


}

