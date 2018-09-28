package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct fy
	//  {
	//		 char a[12];
	//		 int k;
	//		 int s;
	//		 struct fy *p;
	//		 }
	//		 x[100],*head;
	  int n;
	  int i;
	  int j;
	  int l;
	  int kk;
	  int ss;
	  String aa = new String(new char[12]);
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
			 x[i].a = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 x[i].k = tempVar3;
		 }
		 x[i].s = x[i].k >= 60?1:0;
		 x[i].p = &x[i + 1];
	  }
	  head = &x[0];
	  x[n - 1].p = null;
	  for (i = 0;i < n;i++)
	  {
		   for (j = i + 1;j < n;j++)
		   {
				 if (x[i].s == 1 && x[j].s == 1)
				 {
					  if (x[i].k < x[j].k)
					  {
						   kk = x[j].k;
						   ss = x[j].s;
						   aa = x[j].a;
						   for (l = j;l > i;l--)
						   {
							   x[l].k = x[l - 1].k;
							   x[l].s = x[l - 1].s;
							   x[l].a = x[l - 1].a;
						   }
							 x[i].k = kk;
					  x[i].s = ss;
					  x[i].a = aa;
					  }

				 }
		   }
		   if (x[i].s == 1)
		   {
		   System.out.printf("%s\n",x[i].a);
		   }
	  }
	  while (head != null)
	  {
		   if (head.s == 0)
		   {
		   System.out.printf("%s\n",head.a);
		   }
		   head = head.p;
	  }
	}

}

