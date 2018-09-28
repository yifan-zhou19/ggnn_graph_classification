package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			 System.out.print("3");
			 k++;
		}
		if (n % 5 == 0)
		{
			 if (k == 0)
			 {
					 System.out.print("5");
					 k++;
			 }
			 else
			 {
				 System.out.print(" 5");
				 k++;
			 }
		}
		if (n % 7 == 0)
		{
			 if (k == 0)
			 {
					 System.out.print("7");
					 k++;
			 }
			 else
			 {
				 System.out.print(" 7");
				 k++;
			 }
		}
		if (k == 0)
		{
		System.out.print("n");
		}
		return 0;
	}

}

