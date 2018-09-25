package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[200];
	   int[] c = new int[200];
	   int d;
	   int e = 0;
	   for (i = 0;i <= 200;i++)
	   {
		 c[i] = 0;
	   }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct b
	//   {
	//	   int c,d;
	//   }
	//   b[200];
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
			  b[i].c = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i].d = tempVar3;
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (b[i].c >= 90 && b[i].c <= 140 && b[i].d >= 60 && b[i].d <= 90)
		   {
			 a[i] = 1;
		   }
		   else
		   {
			 a[i] = 0;
		   }
	   }
		for (i = 0;i < n;i++)
		{
		  if (a[i] == 1)
		  {
			c[e]++;
		  }
		  else
		  {
			  e++;
		  }
		}
		for (i = 0;i <= e;i++)
		{
		  for (j = i + 1;j <= e;j++)
		  {
			  if (c[i] < c[j])
			  {
				d = c[j];
				c[j] = c[i];
				c[i] = d;
			  }
		  }
		}
		System.out.printf("%d",c[0]);
	return 0;
	}

}

