package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int a;
		int prime = int b;
		int min;
		int max;
		int i;
		int j = 0;
		int[] p = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (i = min;i <= max;i++)
		{
			if (huiwen(i) == 1 && prime(i) == 1)
			{
				j++;
				p[j] = i;
			}
		}
		if (j != 0)
		{
			for (i = 1;i < j;i++)
			{
				System.out.printf("%d,",p[i]);
			}
			System.out.printf("%d",p[j]);
		}
		else
		{
			System.out.print("no");
		}
	}
	public static int huiwen(int a)
	{
		int temp;
		int weishu = 0;
		int i;
		int j = -1;
		int count = 0;
		int[] number = new int[10];
		for (i = 1;;i *= 10)
		{
			if (a / i >= 1 && a / i < 10)
			{
				weishu++;
			}
			else if (a / i >= 10)
			{
				weishu++;
				continue;
			}
			else
			{
				break;
			}
		}
		temp = a;
		for (i = Math.pow((float)10,weishu - 1);i >= 1;i /= 10)
		{
			if (temp / i >= 1 && temp / i < 10)
			{
				j++;
				number[j] = temp / i;
				temp %= i;
			}
			else
			{
				j++;
				number[j] = 0;
				temp %= i;
			}
		}
		for (i = 0;i < weishu;i++)
		{
			if (number[i] != number[weishu - i - 1])
			{
				count++;
			}
		}
		if (count == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int prime(int b)
	{
		int i;
		for (i = 2;i <= Math.sqrt((float)b);i++)
		{
			if (b % i == 0)
			{
				break;
			}
		}
		if (i > Math.sqrt((float)b))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}



}

