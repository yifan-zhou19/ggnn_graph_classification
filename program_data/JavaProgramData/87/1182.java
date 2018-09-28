package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  int g;
	  int h;
	  int i;
	  int j;
	  int k;
	  int l;
	  int o;
	  int p;
	  int z;
	  int q;
	  int t;
	  while (true)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  c = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  d = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  e = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  f = Integer.parseInt(tempVar6);
	  }
	  if (a == 0)
	  {
		  break;
	  }
	  d += 12;

	  if (f >= c)
	  {
		q = f - c;
	  }
	  else
	  {
		q = f + 60 - c;
		e -= 1;
	  }
	  if (e >= b)
	  {
		p = e - b;
	  }
	  else
	  {
		p = e+60 - b;
		d -= 1;
	  }
	  o = d - a;
	  t = o * 60 * 60 + p * 60 + q;
	System.out.printf("%d\n",t);
	  }

	  return 0;
	}
}

