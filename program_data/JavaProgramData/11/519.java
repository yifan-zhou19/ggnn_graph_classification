package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int a;
		int b;
		int c;
		int i;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		y = 0;
		for (i = 0;i < b - 1;i++)
		{
			y = y + A[i];
		}
		y = y + c;
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
		   if (b == 1 || b == 2)
		   {
			  System.out.printf("%d",y);
		   }
		   else
		   {
			  y = y + 1;
			  System.out.printf("%d",y);
		   }
		}
		else
		{
			System.out.printf("%d",y);
		}
		return 0;
	}

}

