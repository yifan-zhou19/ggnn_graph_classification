package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		char c;
		int i = 1;
		int k;
		int j = 0;
		int t;
		int max = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ',')
			{
				x[i] = x[i] * 10 + c - '0';
			}
			else
			{
				i++;
			}
		}
		k = i;
		i = 1;
		//for(i=1;i<=k;i++) printf("%d ",x[i]);
		while ((c = System.in.read()) != '\n')
		{
			if (c != ',')
			{
				y[i] = y[i] * 10 + c - '0';
			}
			else
			{
				i++;
			}
		}
		System.out.printf("%d ",k);
		for (t = 0;t <= 1000;t++)
		{
			j = 0;
			for (i = 1;i <= k;i++)
			{
				if (t >= x[i] != 0 && t < y[i])
				{
					j++;
				}
			}
			if (max < j)
			{
				max = j;
			}
		}
		System.out.printf("%d\n",max);
	}





}
