package <missing>;

public class GlobalMembers
{
	public static int[] sig = new int[1000];
	public static int len(int i)
	{
		int j;
		for (j = 0;;j++)
		{
			if (Math.pow(10,j) - i > 0)
			{
				break;
			}
		}
		//printf("%d,",j);
		return (j);
	}
	public static int rev(int i,int x)
	{
		int j;
		int[] num = new int[100];
		int n = 0;
		for (j = 1;j <= x;j++)
		{
			num[j] = i % 10;
			i = i / 10;
		}
		for (j = 1;j <= x;j++)
		{
			//printf("%d,",num[j]);
		for (j = 1;j <= x;j++)
		{
			if (num[j] == num[x + 1 - j])
			{
				n++;
			}
		}
		}
		if (n == x)
		{
			//printf("1,");
			return (1);
		}
		else
		{
			//printf("0,");
			return (0);
		}
	}
	public static int s(int i)
	{
		int j;
		int n = 0;
		for (j = 2;j < i;j++)
		{
			if (i % j == 0)
			{
				n++;
			}
		}
		if (n == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int sig = 0;
		int n;
		int m;
		int x;
		int y;
		int z;
		int i;
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
		for (i = m;i <= n;i++)
		{
			y = z = 0;
			x = len(i);
			y = rev(i, x);
			z = s(i);
			if (y + z == 2)
			{
				sig++;
				if (sig == 1)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (sig == 0)
		{
			System.out.print("no");
		}
	}
}

