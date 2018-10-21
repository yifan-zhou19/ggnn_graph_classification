package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 5;i++)
		{
			a = n % 10;
			System.out.printf("%d",a);
			n = (n - a) / 10;
			if (n == 0)
			{
			break;
			}
		}
	}
}

