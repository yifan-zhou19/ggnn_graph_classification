package <missing>;

public class GlobalMembers
{
	public static int leap(int Y)
	{
		if (Y % 400 == 0)
		{
		return 1;
		}
		else if (Y % 100 == 0)
		{
		return 0;
		}
		else if (Y % 4 == 0)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int Y;
		int M;
		int D;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			D = Integer.parseInt(tempVar3);
		}
		if (leap(Y) == 0)
		{
					  if (M == 1)
					  {
					  System.out.printf("%d",D);
					  }
					  if (M == 2)
					  {
					  System.out.printf("%d",31 + D);
					  }
					  if (M == 3)
					  {
					  System.out.printf("%d",31 + 28 + D);
					  }
					  if (M == 4)
					  {
					  System.out.printf("%d",31 + 28 + 31 + D);
					  }
					  if (M == 5)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + D);
					  }
					  if (M == 6)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + D);
					  }
					  if (M == 7)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + D);
					  }
					  if (M == 8)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + D);
					  }
					  if (M == 9)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + D);
					  }
					  if (M == 10)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + D);
					  }
					  if (M == 11)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + D);
					  }
					  if (M == 12)
					  {
					  System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + D);
					  }
		}
		else
		{
					  if (M == 1)
					  {
					  System.out.printf("%d",D);
					  }
					  if (M == 2)
					  {
					  System.out.printf("%d",31 + D);
					  }
					  if (M == 3)
					  {
					  System.out.printf("%d",31 + 29 + D);
					  }
					  if (M == 4)
					  {
					  System.out.printf("%d",31 + 29 + 31 + D);
					  }
					  if (M == 5)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + D);
					  }
					  if (M == 6)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + D);
					  }
					  if (M == 7)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + D);
					  }
					  if (M == 8)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + D);
					  }
					  if (M == 9)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + D);
					  }
					  if (M == 10)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + D);
					  }
					  if (M == 11)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + D);
					  }
					  if (M == 12)
					  {
					  System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + D);
					  }
		}
		System.in.read();
		System.in.read();
	}
}

