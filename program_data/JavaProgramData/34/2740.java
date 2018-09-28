package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m == 1)
		{
			System.out.print("End");
		}
		else
		{
			do
			{
			int n;
			 if (m % 2 != 0)
			 {
				 n = m * 3 + 1;
				 System.out.printf("%d*3+1=%d",m,n);
				 System.out.print("\n");
				 m = n;
			 }
			 if (m % 2 == 0)
			 {
				 n = m / 2;
				 System.out.printf("%d/2=%d",m,n);
				 System.out.print("\n");
				 m = n;
			 }

			}while (m > 1);

		System.out.print("End");
		}
	}
}

