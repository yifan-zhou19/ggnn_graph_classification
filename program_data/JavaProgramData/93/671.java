package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0))
		{
		System.out.printf("%d %d %d",3,5,7);
		}
		 if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 != 0))
		 {
		System.out.printf("%d %d",3,5);
		 }
		  if ((i % 3 == 0) && (i % 5 != 0) && (i % 7 == 0))
		  {
		System.out.printf("%d %d",3,7);
		  }
		  if ((i % 3 != 0) && (i % 5 == 0) && (i % 7 == 0))
		  {
		System.out.printf("%d %d",5,7);
		  }
		if ((i % 3 == 0) && (i % 5 != 0) && (i % 7 != 0))
		{
		  System.out.printf("%d",3);
		}
		if ((i % 3 != 0) && (i % 5 == 0) && (i % 7 != 0))
		{
		  System.out.printf("%d",5);
		}
		if ((i % 3 != 0) && (i % 5 != 0) && (i % 7 == 0))
		{
		  System.out.printf("%d",7);
		}
		if ((i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0))
		{
		 System.out.print("n");
		}
		 return 0;
	}





}

