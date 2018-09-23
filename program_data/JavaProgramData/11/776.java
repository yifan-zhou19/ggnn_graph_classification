package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int y;
	   int m;
	   int d;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   y = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   d = Integer.parseInt(tempVar3);
	   }
	   int[] n = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   if (y % 100 == 0 && y % 400 == 0)
	   {
		 n[1] = 29;
	   }
	   if (y % 100 != 0 && y != 0 & 4 == 0)
	   {
		 n[1] = 29;
	   }
	   int sum = 0;
	   for (i = 0;i < m - 1;i++)
	   {
		 sum = sum + n[i];
	   }
	   System.out.printf("%d\n",sum + d);
	   System.in.read();
	   System.in.read();
	}

}

