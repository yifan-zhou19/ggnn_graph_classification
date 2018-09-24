package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct a
	//   {
	//	   int h;
	//	   int y;
	//	   int s;
	//   }
	//   b[100000],e;
	   int[] c = new int[100000];
	   int n;
	   int i;
	   int f;
	   int j;
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
			   b[i].h = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[i].y = tempVar3;
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   b[i].s = tempVar4;
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   c[i] = b[i].y + b[i].s;
	   }
	   for (j = 0;j < 3;j++)
	   {
		   for (i = j + 1;i < n;i++)
		   {
			   if (c[i] > c[j])
			   {
				   d = c[j];
				   c[j] = c[i];
				   c[i] = d;
				   e = b[j];
				   b[j] = b[i];
				   b[i] = e;

			   }
		   }
		   f = b[j].h;
		   System.out.printf("%d %d\n",f,c[j]);
	   }

	return 0;
	}
}

