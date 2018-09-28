package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int A;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (A != 1)
			{
				if (a % 2 == 0)
				{
					A = a / 2;
					System.out.printf("%d/2=%d\n",a,A);
				}
				if (a % 2 != 0)
				{
					A = a * 3 + 1;
					System.out.printf("%d*3+1=%d\n",a,A);
				}
				a = A;
			}
			System.out.print("End");
		}
		return 0;
	}




}

