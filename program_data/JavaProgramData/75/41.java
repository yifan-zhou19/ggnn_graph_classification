package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i = 0;
		int[][] b = new int[1000][2];
		int n = 0;
		int j;
		int max;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n++;
			i++;
		}while (c != '\n');
		i = 0;
		c = 0;
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			i++;
		}while (c != '\n');
		for (j = 0;j < 1000;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j >= b[i][0] != 0 && j < b[i][1])
				{
					a[j]++;
				}
			}
		}
		max = a[0];
		for (i = 1;i < 1000;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		System.out.printf("%d %d",n,max);
	}
}

