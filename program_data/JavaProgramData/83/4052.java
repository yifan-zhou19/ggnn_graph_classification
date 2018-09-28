package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] s = new int[10];
		int[] grade = new int[10];
		int Sum;
		float[] p = new float[10];
		float sum;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		sum = 0F;
		Sum = 0;
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grade[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (grade[i] >= 90 && grade[i] <= 100)
			{
				p[i] = 4.0F;
			}
			else if (grade[i] >= 85)
			{
				p[i] = 3.7F;
			}
			else if (grade[i] >= 82)
			{
				p[i] = 3.3F;
			}
			else if (grade[i] >= 78)
			{
				p[i] = 3.0F;
			}
			else if (grade[i] >= 75)
			{
				p[i] = 2.7F;
			}
			else if (grade[i] >= 72)
			{
				p[i] = 2.3F;
			}
			else if (grade[i] >= 68)
			{
				p[i] = 2.0F;
			}
			else if (grade[i] >= 64)
			{
				p[i] = 1.5F;
			}
			else if (grade[i] >= 60)
			{
				p[i] = 1.0F;
			}
			else
			{
				p[i] = 0F;
			}
			sum = sum + p[i] * s[i];
			Sum = Sum + s[i];
		}
		GPA = sum / Sum;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

