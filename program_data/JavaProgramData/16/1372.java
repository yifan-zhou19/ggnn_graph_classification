package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int s = 0;
		int a;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = 1;i <= 5;i++)
			{
				a = n % 10;
				if (a == 0)
				{
					j = j + 1;
				}
				n = n / 10;
				s = s * 10 + a;
				if (n == 0)
				{
					break;
				}
			}
			for (i = 0;i < j;i++)
			{
				if (j == 0)
				{
					break;
				}
				System.out.print("0");
			}
			System.out.printf("%d",s);
		}
		return 0;
	}
}

