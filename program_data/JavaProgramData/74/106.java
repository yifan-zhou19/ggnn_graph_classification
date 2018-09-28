package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int j;
		int r;
		j = 1;
		for (i = 2;i < n && j == 1;i++)
		{
			if (n % i == 0)
			{
				j = 0;
				break;
			}
		}
		if (j == 1)
		{
			r = 1;
		}
		else
		{
			r = 0;
		}
		return (r);
	}
	public static int huiwen(int n)
	{
		int weishu;
		int i;
		int j = 1;
		int r;
		for (i = 0;j == 1;i++)
		{
			if (n / (int)Math.pow(10,i) == 0)
			{
				j = 0;
				break;
			}
		}
		weishu = i;
		int[] num = new int[10];
		for (j = 1;j <= weishu;j++)
		{
			num[j] = (n % (int)Math.pow(10,j) - n % (int)Math.pow(10,(j - 1))) / (int)Math.pow(10,(j - 1));
		}
		int k = 1;
		for (j = 1;j <= weishu != 0 && k == 1;j++)
		{
			if (num[j] != num[weishu - j + 1])
			{
				k = 0;
				break;
			}
		}
		if (k == 1)
		{
			r = 1;
		}
		else
		{
			r = 0;
		}
		return (r);
	}
	public static void Main()
	{
		int m;
		int n;
		int[] num = new int[100];
		int i;
		for (i = 0;i < 100;i++)
		{
			num[i] = -1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int l = 0;
		for (i = m;i <= n;i++)
		{
			if ((sushu(i) == 1) && (huiwen(i) == 1))
			{
				num[l] = i;
				l++;
			}
		}
		if (num[0] == -1)
		{
			System.out.print("no\n");
		}
		else if (num[1] == -1)
		{
			System.out.printf("%d\n",num[0]);
		}
		else
		{
			System.out.printf("%d",num[0]);
			for (i = 1;i < l - 1;i++)
			{
				System.out.printf(",%d",num[i]);
			}
			System.out.printf(",%d\n",num[l - 1]);
		}
	}
}

