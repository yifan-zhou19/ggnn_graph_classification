package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			if (a % 5 == 0)
			{
				if (a % 7 == 0)
				{
					System.out.printf("%d %d %d\n",3,5,7);
				}
				else
				{
					System.out.printf("%d %d\n",3,5);
				}
			}
			else
			{
				if (a % 7 == 0)
				{
					System.out.printf("%d %d\n",3,7);
				}
				else
				{
					System.out.printf("%d\n",3);
				}
			}
		}
		else
		{
		 if (a % 5 == 0)
		 {
				if (a % 7 == 0)
				{
					System.out.printf("%d %d\n",5,7);
				}
				else
				{
					System.out.printf("%d\n",5);
				}
		 }
			else
			{
				if (a % 7 == 0)
				{
					System.out.printf("%d\n",7);
				}
				else
				{
					System.out.print("n\n");
				}
			}
		}
	}
}

