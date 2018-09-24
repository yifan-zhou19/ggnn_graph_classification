package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int X;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N > 9999)
		{
		  X = 5;
		}
		else if (N > 999)
		{
			X = 4;
		}
			 else if (N > 99)
			 {
				 X = 3;
			 }
				  else if (N > 9)
				  {
					  X = 2;
				  }
					  else
					  {
					  X = 1;
					  }
		a = N / 10000;
		b = (N - 10000 * a) / 1000;
		c = (N - 10000 * a - 1000 * b) / 100;
		d = (N - 10000 * a - 1000 * b - 100 * c) / 10;
		e = (N - 10000 * a - 1000 * b - 100 * c - 10 * d);
		switch (X)
		{
			case 5:
				System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		 break;
		 case 4:
			 System.out.printf("%d%d%d%d\n",e,d,c,b);
		 break;
		 case 3:
			 System.out.printf("%d%d%d\n",e,d,c);
		 break;
		 case 2:
			 System.out.printf("%d%d\n",e,d);
		 break;
		 case 1:
			 System.out.printf("%d\n",e);
		 break;
		}
		return 0;
	}

}

