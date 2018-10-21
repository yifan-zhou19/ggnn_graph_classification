package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		float[][] s = new float[100][3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(s[i][k]) = Float.parseFloat(tempVar2);
				}
				s[i][2] = 1.0 * (s[i][1]) / (s[i][0]);
			}
		}
		for (i = 1;i < m;i++)
		{
			if (((s[i][2]) - (s[0][2])) > 0.05)
			{
				System.out.print("better\n");
			}
			else if (((s[0][2]) - (s[i][2])) > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((((s[0][2]) - (s[i][2])) <= 0.05) && (((s[0][2]) - (s[i][2])) >= -0.05))
			{
				System.out.print("same\n");
			}
		}



	return 0;
	}
}

