package <missing>;

public class GlobalMembers
{
	public static int ifhuiwen(int a)
	{
		int flag;
		int i;
		int t;
		int a_;
		a_ = a;
		for (i = 10,t = 0;a_ != 0;)
		{
			t = t * 10 + a_ % i;
			a_ = a_ / i;
		}
		if (t == a)
		{
			flag = 1;
		}
		return flag;
	}

	public static int ifsushu(int a)
	{
		int flag = 1;
		int i;
		for (i = 2;i < a / 2 + 1;i++)
		{
			if (a % i == 0)
			{
				flag = 0;
			}
		}
		return flag;
	}

	public static void Main()
	{
		int min;
		int max;
		int i;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (i = min;i <= max;i++)
		{
			if (ifhuiwen(i) == 1 && ifsushu(i) == 1 && flag == 0)
			{
				System.out.printf("%d",i);
				flag = i;
			}
			if (ifhuiwen(i) == 1 && ifsushu(i) == 1 && i != flag)
			{
				System.out.printf(",%d",i);
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
	}
}

