package <missing>;

public class GlobalMembers
{
	public static int n;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n % 2 == 1)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			System.out.printf("%d*3+1=",n);
			n = n * 3 + 1;
			System.out.printf("%d\n",n);
			while (n % 2 == 0)
			{
				System.out.printf("%d/2=",n);
				n = n / 2;
				System.out.printf("%d\n",n);
			}
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
		}
		while (n % 2 == 0)
		{
			System.out.printf("%d/2=",n);
			n = n / 2;
			System.out.printf("%d\n",n);
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			while (n % 2 == 1)
			{
				System.out.printf("%d*3+1=",n);
				n = n * 3 + 1;
				System.out.printf("%d\n",n);


			}
		}
		return 0;
	}
}

