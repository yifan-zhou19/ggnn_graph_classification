package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int e;
	  int k;
	  int m;
	  int d;
	  int x;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	  int[] a = new int[n];
	  int[] b = new int[n];
	  double s;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 x = a[0];
	 d = b[0];
	  for (i = 0;i < n;i++)
	  {
			  if (a[i] < x)
			  {
				x = a[i];
			  }
			  if (b[i] > d)
			  {
				d = b[i];
			  }
	  }
	  for (s = (x + 0.5);s < d;s++)
	  {
			k = 0;
		 for (m = 0;m < n;m++)
		 {
			if (s <= b[m] != 0 && s >= a[m])
			{
			   k = 1;
			}
			else
			{
			   k = k;
			}
		 }
	   if (k == 0)
	   {
			 System.out.print("no");
			   break;
	   }
	  }
		if (k != 0)
		{
			System.out.printf("%d %d",x,d);
		}
	 return 0;
	}





}

