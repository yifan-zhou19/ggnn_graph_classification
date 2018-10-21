package <missing>;

public class GlobalMembers
{
	public static int qipa(int p,int q) // ?p???????????q??????
	{
		int i;
		int l;
		int s = 0;
		if (p == 1)
		{
			return 1;
		}
		for (i = p;i > 1;i--)
		{
		  if (p % i == 0 && i <= q)
		  {
			s += qipa(p / i, i);
		  }
		}
		return s;
	}
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int m;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		t = qipa(m, m);
		System.out.printf("%d\n",t);
	  }
	return 0;
	}
}

