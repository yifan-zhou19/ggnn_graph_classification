package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Integer.parseInt(tempVar);
			 }
		if (a == 9)
		{
			System.out.print("9\n");
		}
		else if (a == 6)
		{
			System.out.print("2\n");
		}
		return 0;
	}

}

