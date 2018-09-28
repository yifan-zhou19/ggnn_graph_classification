package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int t;
		if (i == 1 || i == 2)
		{
			   t = 1;
		}
		if (i > 2)
		{
			   t = f(i - 2) + f(i - 1);
		}
		return t;
	}
	public static int Main()
	{
		  int[] a = new int[1000];
		  int n;
		  int i;
		  int b;
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
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  System.out.printf("%d\n",f(a[i]));
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}



}

