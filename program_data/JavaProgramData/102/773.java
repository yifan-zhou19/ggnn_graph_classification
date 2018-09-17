package <missing>;

public class GlobalMembers
{
	/*Macro*/
	public static float[] male = new float[N];
	public static float[] female = new float[N];

	public static void Main(String[] args)
	{
	/*Definition*/

		int i = 0;
		int j = 0;
		int n = 0;
		final String p = "H";
		float h = 0F;
		int ii = 0;
		int jj = 0;
	/*Definition*/
		freopen("in.txt", "r", stdin);
		freopen("out.txt", "w", stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (0 == strcmp(p, "male"))
			{
				male[i++] = h;
			}
			else
			{
				female[j++] = h;
			}
		}

		for (ii = 0; ii < i; ii++)
		{
			for (jj = ii + 1; jj < i; jj++)
			{
				if (male[ii] > male[jj])
				{
					h = male[ii];
					male[ii] = male[jj];
					male[jj] = h;
				}
			}
		}

		for (ii = 0; ii < j; ii++)
		{
			for (jj = ii + 1; jj < j; jj++)
			{
				if (female[ii] < female[jj])
				{
					h = female[ii];
					female[ii] = female[jj];
					female[jj] = h;
				}
			}
		}


		for (ii = 0; ii < i; ii++)
		{
			System.out.printf("%.2lf ", male[ii]);
		}
		for (jj = 0; jj < j - 1; jj++)
		{
			System.out.printf("%.2lf ", female[jj]);
		}
		System.out.printf("%.2lf\n", female[jj]);

	}


}

