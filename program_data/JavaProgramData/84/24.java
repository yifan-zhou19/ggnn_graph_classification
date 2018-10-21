package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int m;
		int t;
		int r;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a < b)
		{
			  t = a;
			  a = b;
			  b = t;
		}
		for (i = 1;i <= n - 2;i++)
		{
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   c = Integer.parseInt(tempVar4);
		   }
		   if (c >= a)
		   {
				r = a,a = c,c = r;
			  k = c;
			  c = b;
			  b = k;
		   }
		  else if (c >= b)
		  {
				t = b;
				b = c;
				c = t;
		  }
		}
		System.out.printf("%d\n%d\n",a,b);
	}

}

