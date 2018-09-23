package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 4;i++)
		{
			System.out.printf("%d", a % 10);
			a = a / 10;
			if (a < 1)
			{
				break;
			}
		}
	}
}

