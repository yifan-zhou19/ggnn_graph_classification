package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		if (x == 2)
		{
			return 1;
		}
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
			return 0;
			}
		}
		return 1;
	}
	public static int huiwen(int x)
	{
		int[] p = new int[500];
		int[] q = new int[500];
		int i;
		int j;
		int y;
		y = x;
		for (i = 0;;i++)
		{
			p[i] = x % 10;
			x = (x - p[i]) / 10;
			if (x == 0)
			{
			break;
			}
		}
			x = y;
		for (j = i;j >= 0;j--)
		{
			 q[j] = x % 10;
			 x = (x - q[j]) / 10;
			if (x == 0)
			{
			break;
			}
		}
		for (j = 0;j <= i;j++)
		{
		   if (p[j] != q[j])
		   {
		   return 0;
		   }
		}
		 return 1;
	}
	public static int Main()
	{
	  int m;
	  int n;
	  int count = 0;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = m;i <= n;i++)
	  {
		  if (sushu(i) == 0)
		  {
		  continue;
		  }
		  else
		  {
				 if (i / 10 == 0 && count == 0)
				 {
					 System.out.printf("%d",i);
					 count++;
				 }
				 else if (i / 10 == 0 && count != 0)
				 {
					 System.out.printf(",%d",i);
					 count++;
				 }
				 else if (i >= 10 && huiwen(i) == 1 && count == 0)
				 {
					 System.out.printf("%d",i);
					 count++;
				 }
				 else if (i >= 10 && huiwen(i) == 1 && count != 0)
				 {
					 System.out.printf(",%d",i);
					 count++;
				 }
		  }

	  }
		  if (count == 0)
		  {
		  System.out.print("no");
		  }
	}
}

