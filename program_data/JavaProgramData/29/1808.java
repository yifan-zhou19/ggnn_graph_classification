package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float sum = 0F;
		float a;
		float b;
		float c;
		float d;
		float e;
		float f;
		int i;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		k = 1;
		while (k <= m)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 1)
			{
				sum = 2F;
			}
			else
			{
				if (n == 2)
				{
					sum = 3.5F;
				}
				else
				{
					i = 3;
					a = 2F;
					b = 1F;
					c = 3F;
					d = 2F;
					sum = 3.5F;
					while (i <= n)
					{
						e = a + c;
						f = b + d;
						a = c;
						b = d;
						c = e;
						d = f;
						sum = sum + c / d;
						i++;
					}
				}
			}
			System.out.printf("%.3f\n",sum);
			k++;
		}
		return 0;
	}

}

