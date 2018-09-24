package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int j;
		int f1;
		int f2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			f1 = f2 = n;
			do
			{
				if (f1 % 2 == 0)
				{
						f2 = f1 / 2;
						System.out.printf("%d/2=%d\n",f1,f2);
						j = f1;
						f1 = f2;
						f2 = j;
				}
				else
				{
					f2 = f1 * 3 + 1;
					System.out.printf("%d*3+1=%d\n",f1,f2);
					j = f1;
					f1 = f2;
					f2 = j;
				}
			} while (f1 != 1);
			System.out.print("End\n");
		}


	}
}

