package <missing>;

public class GlobalMembers
{
	public static int ghl(int p,int q,int r) //r??????? ?q????????????p??????
	{
	   int i;
	   int s = 0;
	   if (r == 0 && p != 0)
	   {
		   return 0;
	   }
	   if (p == 0)
	   {
		   return 1;
	   }
	   for (i = p;i >= 1;i--)
	   {
		 if (i <= q)
		 {
		   s += ghl(p - i, i, r - 1);
		 }
	   }
		return s;
	}
	public static int Main()
	{
	  int m;
	  int n;
	  int t;
	  int sum;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= t;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		sum = ghl(m, m, n);
		System.out.printf("%d\n",sum);
	  }
	 return 0;
	}

}

