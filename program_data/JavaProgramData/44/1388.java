package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int i;
		int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num));
		}
	}

	public static int reverse(int num)
	{
		int numr;
		int i;
		int j;
		int[] digit = new int[10];
		int flag = 0;
		if (num < 0)
		{
			num = -num;
			flag = 1;
		}
		for (i = 0;;i++)
		{
			digit[i] = num % 10;
			num = (num - digit[i]) / 10;
			if (num == 0)
			{
				break;
			}
		}
		numr = 0;
		for (j = 0;j <= i;j++)
		{
			numr = numr * 10 + digit[j];
		}
		if (flag == 1)
		{
			numr = -numr;
		}
		return numr;
	}






}

