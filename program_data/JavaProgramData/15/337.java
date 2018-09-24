package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int x = 0;
	  int i;
	  int j;
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  int s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  a = b = 0;
	  c = d = e = 255;
	  for (i = 1;i <= n * n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		if (c == 0)
		{
		  a = i;
		  break;
		}
	  }
	  for (j = i + 1;j <= n * n;j++)
	  {
		c = d;
		d = e;
		e = f;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			f = Integer.parseInt(tempVar3);
		}
		if ((f != 0) && (c == 0) && (d == 0) && (e == 0))
		{
		  b = j - 1;
		}
	  }
	  int o;
	  int p;
	  int q;
	  int r;
	  o = a % n;
	  p = (-b + 1) % n + n;
	  q = a / n;
	  r = b / n;
	  s = (n - o - p) * (r - q - 1);
	  System.out.printf("%d\n",s);
	}

}

