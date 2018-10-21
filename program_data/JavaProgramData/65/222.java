package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int s;
	  int t;
	  int p;
	  int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  p = 0;
	  q = 0;
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		if (s == 0 && t == 0)
		{
		  ;
		}
		else if (s == 0 && t == 1)
		{
		  p = p + 1;
		}
		else if (s == 0 && t == 2)
		{
		  q = q + 1;
		}
		else if (s == 1 && t == 0)
		{
		  q = q + 1;
		}
		else if (s == 1 && t == 1)
		{
		  ;
		}
		else if (s == 1 && t == 2)
		{
		  p = p + 1;
		}
		else if (s == 2 && t == 0)
		{
		  p = p + 1;
		}
		else if (s == 2 && t == 1)
		{
		  q = q + 1;
		}
		else if (s == 2 && t == 2)
		{
		  ;
		}
	  }
	  if (p > q)
	  {
		System.out.print("A");
	  }
	  else if (p < q)
	  {
		System.out.print("B");
	  }
	  else if (p == q)
	  {
		System.out.print("Tie");
	  }
	  return 0;
	}

}

