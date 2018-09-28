package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int result;
		result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while ((n < 100) && (n > 0))
		{
			if ((n % 7 == 0) || (n == 7) || (n == 17) || (n == 27) || (n == 37) || (n == 47) || (n == 57) || (n == 67) || (n == 77) || (n == 87) || (n == 97) || (n == 70) || (n == 71) || (n == 72) || (n == 73) || (n == 74) || (n == 75) || (n == 76) || (n == 77) || (n == 78) || (n == 79))
			{
				n = n - 1;
			}
			else
			{
				result = result + n * n;
					n = n - 1;
			}
		}
				System.out.printf("%d",result);
				return 0;
	}

}

