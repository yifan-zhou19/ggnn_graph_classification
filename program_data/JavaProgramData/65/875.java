package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			 x = x;
			 y = y;
		 }
		 if (a == 0 && b == 1)
		 {
			 x = x + 1;
		 }
		 if (b == 0 && a == 1)
		 {
			 y = y + 1;
		 }
		 if (a == 1 && b == 2)
		 {
			 x = x + 1;
		 }
		 if (a == 2 && b == 1)
		 {
			 y = y + 1;
		 }
		 if (a == 0 && b == 2)
		 {
			 y = y + 1;
		 }
		 if (a == 2 && b == 0)
		 {
			 x = x + 1;
		 }
		}
		if (x > y)
		{
			System.out.print("A");
		}
		if (x == y)
		{
			System.out.print("Tie");
		}
		if (x < y)
		{
			System.out.print("B");
		}
	   return 0;
	}

}

