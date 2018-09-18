package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct stdudent
	//{
	//	   int ID;
	//	   int a;
	//	   int b;
	//	   int c;
	//
	//	   }
	//	   d[100000];
		   int first;
		   int second;
		   int third;
		   int n;
		   int i;
		   int j;
		   int w;
		   int h;
		   int l;
		   int k;
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
							   d[i].ID = tempVar2;
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   d[i].a = tempVar3;
						   }
						   String tempVar4 = ConsoleInput.scanfRead(" ");
						   if (tempVar4 != null)
						   {
							   d[i].b = tempVar4;
						   }
						   d[i].c = d[i].a + d[i].b;

		   }
						   first = 0;
						   second = 1;
						   third = 2;
						   w = d[0].c;
						   h = d[1].c;
						   l = d[2].c;
						   if (w < h && (h> l))
						   {
						   first = 1;
						   if (w > l)
						   {
						   second = 0;
						   third = 2;
						   }
						   else
						   {
						   second = 2;
						   third = 0;
						   }
						   }
						   else if (l > w)
						   {
							 first = 2;
							 if (w > h)
							 {
									second = 0;
									third = 1;
							 }
									else
									{
									third = 0;
									}

						   }


						   for (j = 3;j < n;j++)
						   {
						   k = d[j].c;
						   w = d[first].c;
						   h = d[second].c;
						   l = d[third].c;
						   if (k > w)
						   {
						   third = second;
						   second = first;
						   first = j;
						   }
						   else if (k > h)
						   {
								third = second;
								second = j;
						   }
							else if (k > l)
							{
							third = j;
							}
						   }
	System.out.printf("%d %d\n",d[first].ID,d[first].c);
	System.out.printf("%d %d\n",d[second].ID,d[second].c);
	System.out.printf("%d %d\n",d[third].ID,d[third].c);
	  System.in.read();
	  System.in.read();
	}

}

