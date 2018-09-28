package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int d;
		float c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a > 1)
		{
			b = a % 2;
			d = a * 3 + 1;
			c = (float)a / 2;
			if (b == 1)
			{
			System.out.printf("%d*3+1=%d\n",a,d);
			}
			else if (b == 0)
			{
				System.out.printf("%d/2=%.0f\n",a,c);
			}
			if (b == 1)
			{
				a = d;
			}
			else
			{
				a = c;
			}
		}
		System.out.print("End");
	}


}

