package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] data = new int[3][1100];
		int n;
		int i;
		int j;
		int max;
		for (n = 1;;)
		{
			char c;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				data[1][n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
			n++;
		}
		for (n = 1;;)
		{
			char c;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				data[2][n] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
			n++;
		}
		System.out.printf("%d",n);
		for (j = 1,max = 0;j <= n;j++)
		{
			if (data[1][j] <= 0 && data[2][j]>0)
			{
				max++;
			}
		}
		for (i = 1;i <= 1000;i++)
		{
			int temp;
			for (j = 1,temp = 0;j <= n;j++)
			{
				if (data[1][j] <= i != 0 && data[2][j]> i)
				{
					temp++;
				}
			}
			if (max <= temp)
			{
				max = temp;
			}
		}
		System.out.printf(" %d",max);
	}
}

