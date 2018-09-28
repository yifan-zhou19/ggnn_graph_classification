package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (;n != 1;)
	{
		if (n % 2 == 0)
		{
			System.out.printf("%d/2=",n);
			n = n / 2;
			System.out.printf("%d",n);
		}
		 else
		 {
			 System.out.printf("%d*3+1=",n);
			 n = n * 3 + 1;
			 System.out.printf("%d",n);
		 }
		 System.out.print("\n");
	}
		System.out.print("End");
		return 0;
	}

}

