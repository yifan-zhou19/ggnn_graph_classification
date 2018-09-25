package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float n;
		int help;
		int j;
		int a;
		int b;
		float x;
		float i;
		j = 2;
		a = 0;
		b = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}

		for (i = 3F;i < 8F;i = i + 2)
		{
			x = n / i;
			help = n / i;
			if (x == help)
			{
				a = a + b;
			}
			j = j + 2;
			b = b * 2;
			//printf("%d %f %d\n",a,x,help);
		}

		switch (a)
		{
		 case 0:
			 System.out.print("n");
			 break;
		 case 1:
			 System.out.print("3");
			 break;
		 case 2:
			 System.out.print("5");
			 break;
		 case 3:
			 System.out.print("3 5");
			 break;
		 case 4:
			 System.out.print("7");
			 break;
		 case 5:
			 System.out.print("3 7");
			 break;
		 case 6:
			 System.out.print("5 7");
			 break;
		 case 7:
			 System.out.print("3 5 7");
			 break;
		 default:
			 ;
		}
	}
}

