package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[2][100000];
	public static int add(int i,int n)
	{
		int k;
		int temp = 0;
		for (k = 1;k <= n;k++)
		{
			if (a[0][k] <= i != 0 && a[1][k]> i)
			{
				temp++;
			}
		}
		return temp;
	}
	public static void Main()
	{
		int i = 1;
		int n;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][i] = Integer.parseInt(tempVar);
		}
		c = System.in.read();
		i++;
		while (c != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0][i] = Integer.parseInt(tempVar2);
			}
			c = System.in.read();
			i++;
		}
		System.out.printf("%d ",i - 1);
		i = 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[1][i] = Integer.parseInt(tempVar3);
		}
		c = System.in.read();
		i++;
		while (c != '\n')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[1][i] = Integer.parseInt(tempVar4);
			}
			c = System.in.read();
			i++;
		}
		n = i - 1;
		int result = 0;
		for (i = 0;i <= 1000;i++)
		{
			int temp = add(i, n);
			if (result < temp)
			{
				result = temp;
			}
		}
		System.out.printf("%d",result);
	}
}

