package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int e;
		int f;
		int k;
		int x;
		int y;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		b = n % 10;
		n = n / 10;
		c = n % 10;
		switch (c)
		{
		 case 0:
			 e = 0;
			 f = 0;
			 k = 0;
			 break;
		 case 1:
			 e = 1;
			 f = 0;
			 k = 0;
			 break;
		 case 2:
			 e = 0;
			 f = 1;
			 k = 0;
			 break;
		 case 3:
			 e = 1;
			 f = 1;
			 k = 0;
			 break;
		 case 4:
			 e = 0;
			 f = 2;
			 k = 0;
			 break;
		 case 5:
			 e = 0;
			 f = 0;
			 k = 1;
			 break;
		 case 6:
			 e = 1;
			 f = 0;
			 k = 1;
			 break;
		 case 7:
			 e = 0;
			 f = 1;
			 k = 1;
			 break;
		 case 8:
			 e = 1;
			 f = 1;
			 k = 1;
			 break;
		 case 9:
			 e = 0;
			 f = 2;
			 k = 1;
			 break;
		}
		 if (b >= 5)
		 {
		   x = b % 5;
		   y = 1;
		 }
		 else
		 {
		 x = b % 5;
		 y = 0;
		 }
		 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,k,f,e,y,x);
		 return 0;
	}


}

