package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] xuefen = new int[10];
		int[] defen = new int[10];
		int t = 0;
		int i;
		int n;
		int j;
		int k;
		double[] gpa = new double[10];
		double total = 0;
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
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (defen[i] > 89)
			{
				gpa[i] = 4;
			}
			else if (defen[i] > 84)
			{
				gpa[i] = 3.7;
			}
			else if (defen[i] > 81)
			{
				gpa[i] = 3.3;
			}
			else if (defen[i] > 77)
			{
				gpa[i] = 3;
			}
			else if (defen[i] > 74)
			{
				gpa[i] = 2.7;
			}
			else if (defen[i] > 71)
			{
				gpa[i] = 2.3;
			}
			else if (defen[i] > 67)
			{
				gpa[i] = 2;
			}
			else if (defen[i] > 63)
			{
				gpa[i] = 1.5;
			}
			else if (defen[i] > 59)
			{
				gpa[i] = 1.0;
			}
			else
			{
				gpa[i] = 0;
			}
			total += gpa[i] * xuefen[i];
			t += xuefen[i];
		}
		total = total / t;
		System.out.printf("%.2f\n",total);
	}

}

