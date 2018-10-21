package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int d = 0;
		int m = num;
		if (m > 0)
		{
		   while (m != 0)
		   {
			   d = d * 10 + m % 10;
			   m /= 10;
		   }
		}
		else if (m < 0)
		{
			m = m * (-1);
			while (m != 0)
			{
				d = d * 10 + m % 10;
				m /= 10;
			}
			d = d * (-1);
		}
			  else
			  {
				  ;
			  }
		return d;
	}

	public static int Main()
	{
		int i;
		int a;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(a));
		}
		System.in.read();
		System.in.read();
	}
}

