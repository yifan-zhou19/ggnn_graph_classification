package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int d;
	   int m;
	   int f;
	   int d1;
	   int m1;
	   int f1;
	   int s = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   d = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   f = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   d1 = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   m1 = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead();
	   if (tempVar6 != null)
	   {
		   f1 = Integer.parseInt(tempVar6);
	   }
	   d1 = d1 + 12;
	   while ((d != 0) || (m != 0) || (f != 0) || (d1 != 12) || (m1 != 0) || (f1 != 0))
	   {
			 s += (d1 - d - 1) * 3600;
			 s += m1 * 60 + f1;
			 s += 3600 - m * 60 - f;
			 System.out.printf("%d\n",s);
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 d = Integer.parseInt(tempVar7);
			 }
			 String tempVar8 = ConsoleInput.scanfRead();
			 if (tempVar8 != null)
			 {
				 m = Integer.parseInt(tempVar8);
			 }
			 String tempVar9 = ConsoleInput.scanfRead();
			 if (tempVar9 != null)
			 {
				 f = Integer.parseInt(tempVar9);
			 }
			 String tempVar10 = ConsoleInput.scanfRead();
			 if (tempVar10 != null)
			 {
				 d1 = Integer.parseInt(tempVar10);
			 }
			 String tempVar11 = ConsoleInput.scanfRead();
			 if (tempVar11 != null)
			 {
				 m1 = Integer.parseInt(tempVar11);
			 }
			 String tempVar12 = ConsoleInput.scanfRead();
			 if (tempVar12 != null)
			 {
				 f1 = Integer.parseInt(tempVar12);
			 }
			 d1 = d1 + 12;
			 s = 0;
	   }
	   return 0;

	}
}

