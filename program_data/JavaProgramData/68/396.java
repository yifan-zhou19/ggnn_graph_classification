package <missing>;

public class GlobalMembers
{
	public static int check(int num)
	{
		int k = 3;
		int flag = 1;
		if (num % 2 == 0)
		{
			flag = 0;
		}
		else if (num == 3 || num == 5 || num == 7)
		{
			flag = 1;
		}
		else
		{
			while (k <= Math.sqrt(num))
			{
				if (num % k == 0)
				{
					flag = 0;
					break;
				}
				k = k + 2;
			}
		}
		return flag;
	}
	public static int Main()
	{
		int i = 6;
		int n;
		int num1;
		int num2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			num1 = 3;
			while (num1 <= i / 2)
			{
				if (check(num1) != 0)
				{
				  num2 = i - num1;
				  if (check(num2) != 0)
				  {
						 System.out.printf("%d=%d+%d\n",i,num1,num2);
						 break;
				  }
				  else
				  {
					  num1 = num1 + 2;
				  }
				}
				else
				{
					num1 = num1 + 2;
				}
			}
			i = i + 2;
		}
		return 0;
	}



}

