package <missing>;

public class GlobalMembers
{
	public static int yu7wuguan(int num)
	{
		if (num % 7 == 0 || num / 10 == 7 || num % 10 == 7)
		{
			return 0;
		}
		return 1;

	}
	public static int Main()
	{
		int i;
		int num;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			if (yu7wuguan(i) != 0)
			{
			   result += i * i;
			}
		}
			System.out.printf("%d",result);
				 return 0;
	}
}

