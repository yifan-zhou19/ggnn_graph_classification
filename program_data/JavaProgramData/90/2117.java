package <missing>;

public class GlobalMembers
{
	public static int ji;
	public static int m;
	public static void fang(int a,int b)
	{
		 int i;
		 if (b == 1)
		 {
			 ji++;
		 }
		 else
		 {
		   for (i = m;i <= (a / b);i++)
		   {
			   m = i;
			   fang(a - i, b - 1);
		   }
		 }
	}

	public static int Main()
	{
		  int k;
		  int n;
		  int p;
		  int q;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (k = 1;k <= n;k++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  p = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  q = Integer.parseInt(tempVar3);
			  }
			  ji = 0;
			  m = 0;
			  fang(p, q);
			  System.out.printf("%d\n",ji);
		  }
	}
}

