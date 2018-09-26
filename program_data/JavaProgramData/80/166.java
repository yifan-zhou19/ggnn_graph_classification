package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int n;
		int m;
		int i;
		int rui = int x;
		int day = new int(int p,int q);
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
			e = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			f = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			g = Integer.parseInt(tempVar6);
		}
		n = day(a, b) + c;
		m = day(e, f) + g;
		for (i = a;i <= e-1;i++)
		{
			if (rui(i) == 0)
			{
				m = m + 365;
			}
			else
			{
				m = m + 366;
			}
		}
		System.out.printf("%d",m - n);
	}
	public static int rui(int x)
	{
	   int z;
	   if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
	   {
		   z = 1;
	   }
	   else
	   {
		   z = 0;
	   }
	   return (z);
	}
	public static int day(int p,int q)
	{
		int l = 0;
		switch (q)
		{
			case 12:
				l = l + 30;
		  case 11:
			  l = l + 31;
		  case 10:
			  l = l + 30;
		  case 9:
			  l = l + 31;
		  case 8:
			  l = l + 31;
		  case 7:
			  l = l + 30;
		  case 6:
			  l = l + 31;
		  case 5:
			  l = l + 30;
			 case 4:
				 l = l + 31;
		  case 3:
		  {
			  if (rui(p) == 0)
			  {
				  l = l + 28;
			  }
			  else
			  {
				  l = l + 29;
			  }
		  }
		  case 2:
			  l = l + 31;
		  case 1:
			  l = l + 0;
		}
			  return (l);
	}
}

