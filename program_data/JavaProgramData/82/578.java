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
	   int i = 1;
	   int x;
	   int y;
	   int z = 0;
	   int max;
	   max = z;
	   while (i <= n)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 x = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 y = Integer.parseInt(tempVar3);
		 }
		 if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
		 {
		   z = z + 1;
			if (z > max)
			{
			  max = z;
			}
		 }
		 else if (z == 0 && x < 90 || x>140 || y < 60 || y>90)
		 {
		   z = 0;
		 }
		 else if (z != 0 && x < 90 || x>140 || y < 60 || y>90)
		 {
		   z = z - 1;
		 }
		   i++;
	   }
	   System.out.printf("%d",max);
	   return 0;
	}

}

