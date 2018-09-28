package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   int s;
	   int i = 1;
	   while (i != 0)
	   {
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
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   d = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   e = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead();
	   if (tempVar6 != null)
	   {
		   f = Integer.parseInt(tempVar6);
	   }
	   i = a;
	   if (i == 0)
	   {
	   break;
	   }
	   s = f - c + (e - b) * 60 + (d - a + 12) * 3600;
	System.out.printf("%d\n",s);
	   }
	return 0;
	}




}

