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
	//	c[50001],t;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i].b = tempVar3;
			}
		}
		for (i = 1;i < n;i++)
		{
		  for (j = n;j > i;j--)
		  {
			   if (c[j].a < c[j - 1].a)
			   {
				   t = c[j];
				   c[j] = c[j - 1];
				   c[j - 1] = t;
			   }
		  }
		}
		 int st = c[1].a;
		 int en = 0;
		 for (i = 1;i < n;i++)
		 {
			 if (c[i].b > en)
			 {
				 en = c[i].b;
			 }
			if (en < c[i + 1].a)
			{
				break;
			}

		 }
		 if (i < n)
		 {
			 System.out.print("no");
		 }
		   else
		   {
			   System.out.printf("%d %d",st,en);
		   }
		 return 0;
	}
}

