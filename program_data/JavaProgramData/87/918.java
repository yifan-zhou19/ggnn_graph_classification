package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sum;
		int[][] t = new int[1000][10];
		int i;
		int k;
		for (i = 0;;i++)
		{
			for (k = 1;k <= 6;k++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i][k] = Integer.parseInt(tempVar);
			}
			}
			if (t[i][1] == 0)
			{
				break;
			}
		}
		for (i = 0;t[i][1] > 0;i++)
		{
			a = t[i][1];
			b = t[i][2];
			c = t[i][3];
			d = t[i][4];
			e = t[i][5];
			f = t[i][6];
			sum = 12 * 60 * 60 - a * 60 * 60 - b * 60 - c + d * 60 * 60 + e * 60 + f;
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

