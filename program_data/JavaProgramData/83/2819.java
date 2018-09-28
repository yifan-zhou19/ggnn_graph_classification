public class grade
{
	public int classgrade;
	public int finalgrade;
	public double GPA;
}

package <missing>;

public class GlobalMembers
{
	public static grade[] G = tangible.Arrays.initializeWithDefaultgradeInstances(100);

	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				G[i].classgrade = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				G[i].finalgrade = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((G[i].finalgrade >= 90) && (G[i].finalgrade <= 100))
			{
				G[i].GPA = G[i].classgrade * 4.0;
			}
			if ((G[i].finalgrade >= 85) && (G[i].finalgrade <= 89))
			{
				G[i].GPA = G[i].classgrade * 3.7;
			}
			if ((G[i].finalgrade >= 82) && (G[i].finalgrade < 84))
			{
				G[i].GPA = G[i].classgrade * 3.3;
			}
			if ((G[i].finalgrade >= 78) && (G[i].finalgrade <= 81))
			{
				G[i].GPA = G[i].classgrade * 3.0;
			}
			if ((G[i].finalgrade >= 75) && (G[i].finalgrade <= 77))
			{
				G[i].GPA = G[i].classgrade * 2.7;
			}
			if ((G[i].finalgrade >= 72) && (G[i].finalgrade <= 74))
			{
				G[i].GPA = G[i].classgrade * 2.3;
			}
			if ((G[i].finalgrade >= 68) && (G[i].finalgrade <= 71))
			{
				G[i].GPA = G[i].classgrade * 2.0;
			}
			if ((G[i].finalgrade >= 64) && (G[i].finalgrade <= 67))
			{
				G[i].GPA = G[i].classgrade * 1.5;
			}
			if ((G[i].finalgrade >= 60) && (G[i].finalgrade <= 63))
			{
				G[i].GPA = G[i].classgrade * 1.0;
			}
			if (G[i].finalgrade <= 60)
			{
				G[i].GPA = 0;
			}
		}
		double allG = 0;
		double allcG = 0;
		for (i = 0;i < n;i++)
		{
			allG = allG + G[i].GPA;
		}
		for (i = 0;i < n;i++)
		{
			allcG = allcG + G[i].classgrade;
		}
		float g = allG / allcG;
		System.out.printf("%.2f", g);
		return 0;
	}

}

