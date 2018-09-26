package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[210];
	public static int[] b = new int[210];
	public static int n;
	public static int pd(int a,int b)
	{
		 if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		 {
		 return 1;
		 }
		 else if (a == b)
		 {
		 return 0;
		 }
		 else
		 {
		 return -1;
		 }
	}
	public static int Main()
	{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
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
		  int s = 0;
		  for (i = 0;i < n;i++)
		  {
		  s = s + pd(a[i], b[i]);
		  }
		  if (s > 0)
		  {
		  System.out.print("A");
		  }
		  else if (s == 0)
		  {
		  System.out.print("Tie");
		  }
		  else
		  {
		  System.out.print("B");
		  }

	}

}

