package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int s;
	if (n == 0)
	{
		System.out.print("0");
		return 0;
	}

	while (n != 0)
	{
		s = n % 10;
		n /= 10;
		System.out.printf("%d",s);
	}

	  return 0;
	}
}

