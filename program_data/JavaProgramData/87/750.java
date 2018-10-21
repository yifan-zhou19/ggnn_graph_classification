package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int shi;
	   int fen;
	   int miao;
	   int s;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   for (i = 0;;i++)
	   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a = Integer.parseInt(tempVar);
			   }
			   String tempVar2 = ConsoleInput.scanfRead(" ");
			   if (tempVar2 != null)
			   {
				   b = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   c = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   d = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead(" ");
			   if (tempVar5 != null)
			   {
				   e = Integer.parseInt(tempVar5);
			   }
			   String tempVar6 = ConsoleInput.scanfRead(" ");
			   if (tempVar6 != null)
			   {
				   f = Integer.parseInt(tempVar6);
			   }
		   if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
		   {
			   break;
		   }
		   shi = d + 12 - a;
		   if (b > e)
		   {
			   shi = shi - 1;
			   fen = e+60 - b;
		   }
		   else
		   {
			   fen = e - b;
		   }
		   if (c > f)
		   {
			   fen = fen - 1;
			   miao = f + 60 - c;
		   }
		   else
		   {
			   miao = f - c;
		   }
		   s = shi * 3600 + fen * 60 + miao * 1;
		   System.out.printf("%d\n",s);
	   }
	   return 0;
	}
}

