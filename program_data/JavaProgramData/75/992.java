package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] x = new int[1000 + 1];
		int[] y = new int[1000 + 1];
		int[] flag = new int[1000 + 1];
		char p;
		int number;
		int n;
		int max;
		int sum;
		int a = 0;
		int k;
		max = 1;
		number = 1;

		for (i = 1 ; i <= 2 ; i++)
		{
			while (true)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					p = tempVar.charAt(0);
				}
				if (p == '\n' || p == ',')
				{

					if (i == 1)
					{
						x[number] = a;
						number++;
					}
					else
					{
						y[number] = a;
						number++;
					}
					a = 0;
					if (p == '\n')
					{
						break;
					}
				}
				else
				{
				a = a * 10 + p - '0';
				}
			}
			n = number - 1;
			number = 1;
		}

		for (i = 1 ; i <= n ; i++)
		{
			for (j = x[i] ; j < y[i] ; j++)
			{
				flag[j]++;

			}
		}


		for (i = 0 ; i < 1000; i++)
		{
			if (max < flag[i])
			{
			max = flag[i];
			}
		}
		System.out.printf("%d %d\n",n,max);

		return 0;
	}


}

