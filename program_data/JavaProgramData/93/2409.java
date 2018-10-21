package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if ((m % 3 != 0) && (m % 5 != 0) && (m % 7 != 0))
		{
			System.out.print("n");
		}
		else
		{
			for (i = 3;i <= 7;i = i + 2)
			{
			if (m % i == 0)
			{
				System.out.printf("%d",i);
				for (j = i + 2;j <= 7;j = j + 2)
				{
					if (m % j == 0)
					{
						System.out.print(" ");
						break;
					}
				}
			}
			}
		}
	}
}

