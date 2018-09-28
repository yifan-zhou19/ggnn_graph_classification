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
		int r3 = 0;
		int r5 = 0;
		int r7 = 0;
		if (n % 3 != 0)
		{
			r3 = 1;
		}
		if (n % 5 != 0)
		{
			r5 = 1;
		}
		if (n % 7 != 0)
		{
			r7 = 1;
		}
		int temp = r3 * 4 + r5 * 2 + r7;
		switch (temp)
		{
			case 7 :
				 System.out.print("n\n");
				 break;
			case 1 :
				 System.out.print("3 5\n");
				 break;
			case 2 :
				 System.out.print("3 7\n");
				 break;
			case 4 :
				 System.out.print("5 7\n");
				 break;
			case 6 :
				 System.out.print("7\n");
				 break;
			case 5 :
				 System.out.print("5\n");
				 break;
			case 3 :
				 System.out.print("3\n");
				 break;
			case 0 :
				 System.out.print("3 5 7\n");
				 break;
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

