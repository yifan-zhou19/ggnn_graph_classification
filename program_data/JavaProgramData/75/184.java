package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int t = 0;
		int i = 0;
		int j = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] m = new int[1000];
		char c = ',';
		while (c != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}
		c = ',';
		while (c != '\n')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[j++] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		n = j;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
					m[i]++;
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (m[i] > t)
			{
				t = m[i];
			}
		}
		System.out.printf("%d %d",n,t);
	}

}

