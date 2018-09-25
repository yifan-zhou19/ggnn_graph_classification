package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			System.out.printf("%d",(n % 10));
			n = (int)n / 10;
		}while (n > 0);
		return 0;
	}

}

