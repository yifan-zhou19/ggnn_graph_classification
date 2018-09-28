package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}

	 while (a != 0)
	 {
	  b *= 10;
	  b += a % 10;
	  a /= 10;
	 }
	 System.out.printf("\n%d",b);
	return 0;
	}
}

