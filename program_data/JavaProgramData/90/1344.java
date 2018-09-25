package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] m = new int[100];
		  int[] n = new int[100];
		  int[] a = new int[100];
		  int t;
		  int ppp = new int(int m,int n);
		  int fff = new int(int m,int n);
		  for (int i = 0;i < 100;i++)
		  {
				  a[i] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (int i = 0;i < t;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  m[i] = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  n[i] = Integer.parseInt(tempVar3);
				  }
				  a[i] = ppp(m[i], n[i]);
		  }
		  for (int i = 0;i < t;i++)
		  {
				  System.out.printf("%d\n",a[i]);
		  }
	}
	public static int ppp(int m,int n)
	{
		int p;
		int fff = new int(int m,int n);
		if (n > 1)
		{
		p = ppp(m, n - 1) + fff(m, n);
		}
		else if (n == 1)
		{
		p = 1;
		}
		return (p);
	}
	public static int fff(int m,int n)
	{
		int f;
		if (m > n)
		{
		f = ppp(m - n, n);
		}
		else if (m == n)
		{
		f = 1;
		}
		else if (m < n)
		{
		f = 0;
		}
		return (f);
	}


}

