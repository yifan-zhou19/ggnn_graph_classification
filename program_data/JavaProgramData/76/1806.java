package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int a,b;
	//	}
	//	points[50002],tmp;
		int i;
		int j;
		int n;
		int a;
		int b;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		points[i].a = a;
		points[i].b = b;
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
			   if (points[i].a >= points[i + 1].a)
			   {
				   tmp = points[i + 1];
			points[i + 1] = points[i];
			points[i] = tmp;
			   }
			}
		}
		 for (j = 1;j < n;j++)
		 {
		  if (points[0].b >= points[j].a)
		  {
		  if (points[j].b > points[0].b)
		  {
			  points[0].b = points[j].b;
		  }
		  c++;
		  }
		 else
		 {
			 c = 0;
			 break;
		 }
		 }
		if (c != 0)
		{
			System.out.printf("%d %d",points[0].a,points[0].b);
		}
		 else
		 {
			 System.out.print("no\n");
		 }
		 return 0;
	}


}

