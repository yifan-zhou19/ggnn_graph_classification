package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		   int m,x,y;
	//		   }
	//		   a[100000],aa;
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
					   a[i].m = tempVar2;
				   }
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   a[i].x = tempVar3;
				   }
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   a[i].y = tempVar4;
				   }
			   }
			   for (i = 0;i < 3;i++)
			   {
							   for (j = i + 1;j < n;j++)
							   {
								   if ((a[i].x + a[i].y) < (a[j].x + a[j].y))
								   {
									   aa = a[j];
									   a[j] = a[i];
									   a[i] = aa;
								   }
							   }
			   }
									   for (i = 0;i < 3;i++)
									   {
										   System.out.printf("%d %d\n",a[i].m,(a[i].x + a[i].y));
									   }

	}


}

