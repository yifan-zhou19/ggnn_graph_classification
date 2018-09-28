package <missing>;

public class GlobalMembers
{
	public static int seven(int x)
	{
		int i;
		for (i = 1;i >= 0;i--)
		{
			if (x / (int)(Math.pow(10,i)) == 7)
			{
				return 1;
			}
			else
			{
			x -= x / (int)(Math.pow(10,i)) * Math.pow(10,i);
			}

		}
		return 0;
	}

	public static int Main()
	{
		float[][] a = new float[11][100];
		float p = 0F;
		float gpa;
		int q;
		int n;
		int i;
		int j = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (q = 1;q <= n;q++)
		{
			if ((q % 7 != 0) && (seven(q) == 0))
			{
				m += q * q;

			}

		}
		System.out.printf("%ld",m);


		return 0;
	}
}

