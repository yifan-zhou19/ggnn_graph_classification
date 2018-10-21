package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int huiwen = int x;
	  int sushu = int x;
	  int m;
	  int n;
	  int x;
	  int p;
	  int q;
	  int i;
	  int j;
	  int[] c = new int[1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  i = 0;
	  for (x = m;x <= n;x++)
	  {
		p = huiwen(x);
		q = sushu(x);
		if (p == 1 && q == 1)
		{
		  c[i] = x;
		  i++;
		}
	  }
	  if (i == 0)
	  {
		System.out.print("no\n");
	  }
	  else
	  {
		for (j = 0;j < i;j++)
		{
		  if (j != i - 1)
		  {
			System.out.printf("%d,",c[j]);
		  }
		  else
		  {
			System.out.printf("%d\n",c[j]);
		  }
		}
	  }
	}
	public static int huiwen(int x)
	{
	  int s;
	  int t;
	  int k;
	  int[] a = new int[10];
	  int[] b = new int[10];
	  int y;
	  for (s = 0;x != 0;s++)
	  {
		a[s] = x;
		x = (int)(x / 10);
	  }
	  a[s] = 0;
	  for (t = 0;t < s;t++)
	  {
		b[t] = a[t] - a[t + 1] * 10;
	  }
	  y = 0;
	  for (t = 0;t < s;t++)
	  {
		if (b[t] == b[s - 1 - t])
		{
		  y++;
		}
	  }
	  if (y == s)
	  {
		return (1);
	  }
	  else
	  {
		return (0);
	  }
	}
	public static int sushu(int x)
	{
	  int u;
	  int v;
	  v = 0;
	  for (u = 1;u <= x;u++)
	  {
		if (x % u == 0)
		{
		  v++;
		}
	  }
	  if (v == 2)
	  {
		return (1);
	  }
	  else
	  {
		return (0);
	  }
	}


}

