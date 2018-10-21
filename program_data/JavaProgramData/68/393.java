package <missing>;

public class GlobalMembers
{
	public static int isodd(int num)
	{
		int i;
		int flag = 1;
		if (num % 2 == 0)
		{
		flag = 0;
		}
		else
		{
			if (num == 3 || num == 5 || num == 7)
			{
			flag = 1;
			}
			else
			{
			  for (i = 3;i <= Math.sqrt(num);i = i + 2)
			  {
				if (num % i == 0)
				{
				flag = 0;
				break;
				}
			  }
			}
		}
		return flag;
	}
	public static int Main()
	{
		int n;
		int i;
		int temp1;
		int temp2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (temp1 = 3;temp1 <= n / 2;temp1 = temp1 + 2)
			{
				if (isodd(temp1) != 0)
				{
					temp2 = i - temp1;
					if (isodd(temp2) != 0)
					{
						System.out.printf("%d=%d+%d\n",i,temp1,temp2);
						break;
					}
				}
			}
		}
		return 0;
	}

}

