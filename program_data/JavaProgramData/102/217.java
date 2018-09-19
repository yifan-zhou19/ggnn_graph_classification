package <missing>;

public class GlobalMembers
{
	public static int com(Object a, Object b)
	{
		double a1 = (double) a;
		double a2 = (double) b;

		if (a1 > a2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int r;
		int ren;
		int max;
		int i_nan;
		int i_nv;
		char c;
		double[] nan = new double[200];
		double[] nv = new double[200];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ren = Integer.parseInt(tempVar);
		}
		System.in.read();

		i_nan = i_nv = 0;
		for (i = 0 ; i < ren ; i++)
		{
			for (j = 0 ; j < 4 ; j++)
			{
				c = System.in.read();
			}

			if (c == 'e')
			{
				System.in.read();
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					nan[i_nan++] = Double.parseDouble(tempVar2);
				}
				System.in.read();
			}

			else
			{
				for (k = 0 ; k < 3 ; k++)
				{
					System.in.read();
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					nv[i_nv++] = Double.parseDouble(tempVar3);
				}
				System.in.read();
			}
		}

		qsort((Object)nan, i_nan, (Double.SIZE / Byte.SIZE), com);
		qsort((Object)nv, i_nv, (Double.SIZE / Byte.SIZE), com);

		for (i = 0 ; i < i_nan ; i++)
		{
			System.out.printf("%.2lf", nan[i]);
			System.out.print(" ");
		}
		for (j = i_nv - 1 ; j >= 0 ; j--)
		{
			System.out.printf("%.2lf", nv[j]);
			if (j != 0)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}

		return 0;
	}
}

