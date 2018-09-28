package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  double a;
	  double b;
	  double d = 0;
	  double l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct
	//   {
	//	 double y,x;
	//   }
	//   piont[10000];
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
			   a = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Double.parseDouble(tempVar3);
		   }
		   piont[i].x = a;
		   piont[i].y = b;
		   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < i;j++)
		   {
			   l = Math.sqrt((piont[i].x - piont[j].x) * (piont[i].x - piont[j].x) + (piont[i].y - piont[j].y) * (piont[i].y - piont[j].y));
			   if (l >= d)
			   {
			 d = l;
			   }

		   }
	   }
	  System.out.printf("%.4lf",d);


		return 0;
	}



}

