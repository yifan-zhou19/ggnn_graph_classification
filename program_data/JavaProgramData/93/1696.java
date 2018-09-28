package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
		{
			System.out.print("n");
		}
		else
		{
			for (i = 3,k = 0;i <= 7;i += 2)
			{
				if (k != 0 && x % i == 0)
				{
					System.out.print(" ");
				}
				if (x % i == 0)
				{
					System.out.printf("%d",i);
					k++;
				}
			}
		}
	}

}

