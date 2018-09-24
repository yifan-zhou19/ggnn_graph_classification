package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int y;
	 int n;
	 int d;
	 int x = 0;
	 int i = 1;
	 int z;
	   int[] m = new int[13];
	   m[1] = m[3] = m[5] = m[7] = m[8] = m[10] = m[12] = 31;
	   m[4] = m[6] = m[9] = m[11] = 30;
	   m[2] = 29;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   y = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   d = Integer.parseInt(tempVar3);
	   }
	 if (n == 1)
	 {
		x = d;
		z = x;
	 }
	 else
	 {
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
	  for (i = 1;i < n;i++)
	  {
	   x = x + m[i];
	   z = x + d;
	  }
		}
	   else
	   {
	   for (i = 1;i < n;i++)
	   {
	   x = x + m[i];
	   }
	   z = x + d - 1;
	   }
	 }

		 System.out.printf("%d\n",z);
	  return 0;
	 }


}

