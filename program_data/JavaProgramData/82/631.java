package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[100];
	   int[] b = new int[100];
	   int i;
	   int[] c = new int[100];
	   int j;
	   int d;
	   int p;
	   int q;
	   j = 0;
	   d = 0;
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
			(a[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(b[i]) = Integer.parseInt(tempVar3);
		}
		if ((90 <= a[i]) && (a[i] <= 140) && (60 <= b[i]) && (b[i]) <= 90)
		{
			   j++;
		}
	   else
	   {
		 d++;
		 c[d] = j;
		 j = 0;
	   }
	   }

	  if (j != 0)
	  {
		 d++;
		 c[d] = j;
		 int max = 0;
		 for (p = 1;p <= d;p++)
		 {
		 if (c[p] > max)
		 {
			 //q=c[d];
			 //c[d]=c[d+1];
			 //c[d+1]=q;
			 max = c[p];
		 }
		 }
	  System.out.printf("%d",max);
	  }
	 else
	 {
		 int max = 0;
		 for (p = 1;p <= d;p++)
		 {
		   if (c[p] > max)
		   {
			 //q=c[d];
			 //c[d]=c[d+1];
			 //c[d+1]=q;
			 max = c[p];
		   }
		 }
	   System.out.printf("%d",max);
	 }

	 return 0;
	}



}

