package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int t;
	   int j;
	   int k;
	   int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct point
	//   {
	//	 int a,b,c;
	//	 }
	//	 tope[1000];
	   int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
			  tope[i].a = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  tope[i].b = tempVar3;
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  tope[i].c = tempVar4;
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  days[2] = (tope[i].a % 4 != 0 || (tope[i].a % 100 == 0 && tope[i].a % 400 != 0))?28:29;
		  if (tope[i].b > tope[i].c)
		  {
			  k = tope[i].b;
			  p = tope[i].c;
		  }
		 if (tope[i].b <= tope[i].c)
		 {
			  k = tope[i].c;
			  p = tope[i].b;
		 }
			 t = 0;
			 for (j = p;j < k;j++)
			 {
				  t = t + days[j];
			 }
			 if (t % 7 == 0)
			 {
				System.out.print("YES\n");
			 }
			 if (t % 7 != 0)
			 {
				System.out.print("NO\n");
			 }
	   }
		  return 0;
	}



}

