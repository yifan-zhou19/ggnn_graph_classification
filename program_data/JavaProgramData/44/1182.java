package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int length;
		int N = Math.abs(num);
		int i;
		for (i = 0;N >= Math.pow(10,i);i++)
		{
			length = i + 1;
		}
		int sum = 0;
		int l = length;
		for (i = 0;i <= length - 1;i++,l--)
		{
		sum += (int)(num % (int)Math.pow(10,i + 1) / Math.pow(10,i)) * Math.pow(10,l - 1);
		}
		return sum;
	}
	public static int Main()
	{
	int num;
	int i;
	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",reverse(num));
	}
	return 0;
	}
}

