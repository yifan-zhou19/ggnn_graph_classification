package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] flag = new int[100000];
		int i;
		int j;
		int flagio = 0;
		int temp;
		int judge = int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		temp = m;
		for (i = m;i <= n;i++)
		{
			flag[i] = 1;
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					flag[i] = 0;
				}
			}
		}
		for (i = m;i <= n;i++)
		{
			if ((flag[i]) && (judge(i)) != 0)
			{
			temp = i;
			System.out.printf("%d",i);
			flagio = 1;
			break;
			}
		}
		for (i = temp + 1;i <= n;i++)
		{
			if ((flag[i]) && (judge(i)) != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		if (flagio == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
	public static int judge(int k)
	{
		int i = 0;
		int l;
		int sum = 0;
		int scale = 1;
		int tem;
		tem = k;
		while (k >= Math.pow(10,i))
		{
			i++;
		}
		i--;
		while (i >= 0)
		{
			l = k / Math.pow(10,i);
			sum = sum + l * scale;
			k = k - l * Math.pow(10,i);
			scale = scale * 10;
			i--;
		}
		if (sum == tem)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

