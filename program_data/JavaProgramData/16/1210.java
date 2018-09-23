package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int a;
		int b;
		int c;
		int d;
		int e;
		int p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		if (num >= 10000)
		{
		p = 5;
		}
		else if (num >= 1000)
		{
			 p = 4;
		}
			 else if (num >= 100)
			 {
			 p = 3;
			 }
				  else if (num >= 10)
				  {
				 p = 2;
				  }
					   else
					   {
					   p = 1;
					   }
		a = (int)(num / 10000);
		b = (int)(num % 10000 / 1000);
		c = (int)(num % 1000 / 100);
		d = (int)(num % 100 / 10);
		e = (int)(num % 10);


	   switch (p)
	   {
		case 5:
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
			break;

		case 4:
			System.out.printf("%d%d%d%d",e,d,c,b);
			break;
		case 3:
			System.out.printf("%d%d%d",e,d,c);
			break;
		case 2:
			System.out.printf("%d%d",e,d);
			break;
		case 1:
			System.out.printf("%d",e);
			break;

	   }
	}
}

