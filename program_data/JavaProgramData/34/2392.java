package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("End");
		}
		else
		{
		while (n != 1)
		{

			if (n % 2 == 0)
			{
			n = n / 2;
			System.out.printf("%d/2=%d\n",n * 2,n);
			}
		else if (n % 2 != 0)
		{
			System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
			n = n * 3 + 1;
		}
		}
		}
		System.out.print("End");


	}

}

