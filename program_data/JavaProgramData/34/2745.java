package <missing>;

public class GlobalMembers
{
	public static int suan(int n)
	{
		int temp;
		if (n == 1)
		{
			System.out.print("End");
		   return 0;
		}
		if (n % 2 == 1)
		{
			temp = n;
			n = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",temp,n);
			return suan(n);
		}
		if (n % 2 == 0)
		{
			temp = n;
			n = n / 2;
			System.out.printf("%d/2=%d\n",temp,n);
			return suan(n);
		}

	}



	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		suan(n);
	}

}

