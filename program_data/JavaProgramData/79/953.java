package <missing>;

public class GlobalMembers
{
	public static int yuesefu(int n,int m)
	{
		int n1;
		int m1;
		int i;
		int j;
		n1 = n,m1 = m;
		int[] a = new int[300];
		for (i = 0;i < n1;i++)
		{
		a[i] = i + 1;
		}
		i = 0;
		while (n1 != 0)
		{
		i = i + m1 - 1;
		for (j = i % n1;j < n1 - 1;j++)
		{
		a[j] = a[j + 1];
		}
		i = i % n1;
		n1--;
		}
		return a[0];
	}
	public static int Main()
	{
		  int n;
		  int m;
		  int k;
		  int s = 0;
		  int[] b = new int[30];
		  int zhi;
		  for (k = 0;k < 30;k++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  if (n == 0 && m == 0)
		  {
		  break;
		  }
		  else
		  {
			  b[k] = yuesefu(n, m);
		  s++;
		  }
		  }
		  for (k = 0;k < s;k++)
		  {
		  System.out.printf("%d\n",b[k]);
		  }
		  System.in.read();
		  System.in.read();
	}

}

