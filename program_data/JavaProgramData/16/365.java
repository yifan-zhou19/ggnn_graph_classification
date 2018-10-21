package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
				 System.out.print("0");
		}
			 else
			 {
			 while (n != 0)
			 {
			a = n % 10;
			n = (n - a) / 10;
			System.out.printf("%d",a);
			 }
			 }
		return 0;
	}

}

