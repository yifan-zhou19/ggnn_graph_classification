package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int[] sz = new int[300];
		int s;
		int num;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b = Integer.parseInt(tempVar3);
						 }
						 if (a == b)
						 {
								  num = 0;
						 }
						 if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
						 {
																	  num = 1;
						 }

						 if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
						 {
																	  num = -1;
						 }
						 s = s + num;
		}
		if (s == 0)
		{
				 System.out.print("Tie");
		}
		if (s > 0)
		{
				System.out.print("A");
		}
		if (s < 0)
		{
				System.out.print("B");
		}
		return 0;
	}
}

