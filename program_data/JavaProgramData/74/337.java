package <missing>;

public class GlobalMembers
{
	public static int FLAG = 0;
	public static int TAG = 1;
	public static void Main()
	{
		int m;
		int n;
		int i;
		void func(int num);
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
			func(i);
		}
		if (FLAG == 0)
		{
			System.out.print("no\n");
		}


	}


	public static int back(int num)
	{
		int result = 0;
		while (num > 0)
		{
			result = 10 * result + num % 10;
			num = num / 10;
		}
		return result;
	}

	public static void func(int num)
	{
		int i;
		int flag;
		for (i = 2,flag = 1;i < num;i++)
		{
			if (num % i == 0)
			{
			flag = 0;
			}
		}
			if (num != back(num))
			{
				flag = 0;
			}
			if (TAG != 0 && flag != 0)
			{
				System.out.printf("%d",num);
				FLAG = 1;
				TAG = 0;
			}
			else if (flag)
			{
				System.out.printf(",%d",num);
				FLAG = 1;
			}
	}



}

