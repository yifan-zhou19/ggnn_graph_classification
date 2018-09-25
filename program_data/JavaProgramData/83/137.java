package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] c = new int[10]; //???????
		int[] s = new int[10]; //???????
		float[] g = new float[10]; //?????????
		float ss; //???????
		float G = 0.0F;
		float C = 0.0F;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			C = C + c[i];
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
			if (s[i] >= 90)
			{
				ss = 4.0F;
			}
			else if (s[i] >= 85)
			{
				ss = 3.7F;
			}
			else if (s[i] >= 82)
			{
				ss = 3.3F;
			}
			else if (s[i] >= 78)
			{
				ss = 3.0F;
			}
			else if (s[i] >= 75)
			{
				ss = 2.7F;
			}
			else if (s[i] >= 72)
			{
				ss = 2.3F;
			}
			else if (s[i] >= 68)
			{
				ss = 2.0F;
			}
			else if (s[i] >= 64)
			{
				ss = 1.5F;
			}
			else if (s[i] >= 60)
			{
				ss = 1.0F;
			}
			else
			{
				ss = 0.0F;
			}
			g[i] = ss * c[i];
			G = G + g[i];
		}
		GPA = G / C;
		System.out.printf("%.2f\n", GPA);
		return 0;
	}
}

