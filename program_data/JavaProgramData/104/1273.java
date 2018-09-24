package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void zhao(int n,int y,int a[]);
		int x = 0;
		int y = 0;
		int[] a = new int[100];
		int t = 0;
		int i = 0;
		int n = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x > y)
		{
			 t = y;
		 y = x;
		 x = t;
		}
		 a[0] = x;
		for (i = 1;;i++)
		{
			a[i] = a[i - 1] / 2;
		  if (a[i] / 2 == 0)
		  {
			  break;
		  }
		}
		  n = i;
		  zhao(n, y, a);

		//getchar();
		//getchar();
		return 0;
	}
	public static void zhao(int n, int y, int[] a)
	{
		int i = 0;
		int t = 0;
	  for (i = 0;i <= n;i++)
	  {
		  if (a[i] == y)
		  {
			  System.out.printf("%d",y);
			t = 1;
			break;

		  }
	  }

		  if (y / 2 != 0 && t == 0)
		  {
		  zhao(n, y / 2, a);
		  }

	}
}

