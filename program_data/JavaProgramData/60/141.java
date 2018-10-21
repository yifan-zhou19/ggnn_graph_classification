package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int number;
		int i;
		int n;
		int p;
		int x;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		n = 2;
		for (n = 1;n <= number;n++)
		{
		i = 2; //?????i???2
		do
		{
		 p = n % i;
		 if (p != 0)
		 {
			 i = i + 1;
		 }
		 else
		 {
			 break;
		 }
		} while (i <= n - 1);
		if (i == x + 2)
		{
		System.out.printf("%d %d\n",x,n);
		m = 1;
		}
		if (i == n)
		{
			x = n;
		}
		}
		if (m == 0)
		{
			System.out.print("empty");
		}

	}
}

