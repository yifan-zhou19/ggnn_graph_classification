package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int zen,xiao;
	//	}
	//	a[10000];
		int i;
		int n;
		int b;
		int c;
		int t;
		int j;
		int min;
		int max;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		max = 0;
		m = 0;
		for (i = 1;i <= n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   c = Integer.parseInt(tempVar3);
		   }
			   if (t == 0)
			   {
				   min = b;
				   t = 1;
			   }
			   if (b < min)
			   {
				   min = b;
			   }
			   if (c > max)
			   {
				   max = c;
			   }
		   for (j = b;j < c;j++)
		   {
			   a[j].zen = 1;
			   a[j].xiao = 1;
		   }
		   a[c].zen = 1;

		}
		  for (j = min;j < max;j++)
		  {
			   if ((a[j].zen != 1) || (a[j].xiao != 1))
			   {
				   m = 1;
				   System.out.print("no\n");
				   break;
			   }
		  }
		   if (m == 0)
		   {
			   System.out.printf("%d %d\n",min,max);
		   }
		return 0;
	}
}

