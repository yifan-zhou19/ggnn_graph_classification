package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//	   int a,b;
	//		   }
	//		   Q[50000];
		int n;
		int i;
		int j;
		int c;
		int d;
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
			   (Q[i].a) = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (Q[i].b) = tempVar3;
		   }
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - i;j++)
			{
			   if (Q[j - 1].a > Q[j].a)
			   {
				  Q[500] = Q[j - 1];
				  Q[j - 1] = Q[j];
				  Q[j] = Q[500];
			   }
			}
		}

		for (i = 0,c = Q[0].a,d = Q[0].b;i < n;i++)
		{

			 if (Q[i].a > d)
			 {
				 System.out.print("no");
				 return 0;
			 }
			 else
			 {
				if (Q[i].b > d)
				{
					d = Q[i].b;
				}
			 }
		}
		System.out.printf("%d %d",c,d);

	return 0;
	}



}

