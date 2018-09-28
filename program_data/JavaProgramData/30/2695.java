package <missing>;

public class GlobalMembers
{
	public static int unrelatedNumber(int num, int sum)
	{
		 if (num == 0)
		 {
				  return sum;
		 }
		if (num % 7 == 0 || num % 10 == 7 || num / 10 == 7)
		{
				  return unrelatedNumber(num - 1, sum);
		}
		return unrelatedNumber(num - 1, sum + num * num);
	}

	public static int Main(String[] args)
	{
		int num;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num >= n || num <= 0)
		{
				  System.out.print("Input a illegal number.\n");
				  return -1;
		}
		System.out.printf("%d", unrelatedNumber(num, sum));
	}
}

