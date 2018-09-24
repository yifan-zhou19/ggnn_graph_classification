package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fan = int x;
		int k;
		int z;
		int b;
		for (k = 1;k < 7;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				z = Integer.parseInt(tempVar);
			}
			b = fan(z);
			System.out.printf("%d\n",b);
		}
		return 0;
	}
	public static int fan(int x)
	{
		int y = 0;
		int ne = 0;
		int j;
		int[] wei = new int[1000];
		double i;
		if (x == 0)
		{
			y = 0;
		}
		else
		{
			if (x < 0)
			{
				ne = 1;
				x = 0 - x;
			}
			for (i = 1;(x >= Math.pow(10,i));i++)
			{
			}
			for (j = 0;j < i;j++)
			{
				wei[j] = x % 10;
				x = x / 10;
			}
			for ((i = i - 1,j = 0);i >= 0;(i--,j++))
			{
				y += wei[j] * Math.pow(10,i);
			}
			if (ne == 1)
			{
				y = 0 - y;
			}
		}
		return y;
	}
}

