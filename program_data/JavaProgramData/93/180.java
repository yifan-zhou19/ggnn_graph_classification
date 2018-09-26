package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int[] b = {3, 5, 7};
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			if (a % b[i] == 0)
			{
				System.out.printf("%d",b[i]);
				if (a % b[i + 1] == 0 && i + 1 < 3)
				{
					System.out.print(' ');
				}
				else if (a % b[i + 2] == 0 && i + 2 < 3)
				{
					System.out.print(' ');
				}
			}
			else if (a % b[i] != 0 && a % b[i + 1] != 0 && a % b[i + 2] != 0)
			{
				System.out.print("n");
			}

		}
	}

}

