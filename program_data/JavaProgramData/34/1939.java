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
		while (a != 1)
		{
		while (a % 2 == 1)
		{
		 System.out.printf("%d*3+1=%d\n",a,a * 3 + 1);
		 a = a * 3 + 1;
		 continue;
		}
		 while (a % 2 == 0)
		 {
		  System.out.printf("%d/2=%d\n",a,a / 2);
		  a = a / 2;
		  continue;
		 }
		}
		  System.out.print("End");

	}

}

