package <missing>;

public class GlobalMembers
{
	public static float GPA(int a)
	{
		if (a >= 90)
		{
			return 4F;
		}
			else if (a >= 85)
			{
				return 3.7F;
			}
			else if (a >= 82)
			{
				return 3.3F;
			}
			else if (a >= 78)
			{
				return 3F;
			}
			else if (a >= 75)
			{
				return 2.7F;
			}
			else if (a >= 72)
			{
				return 2.3F;
			}
			else if (a >= 68)
			{
				return 2F;
			}
			else if (a >= 64)
			{
				return 1.5F;
			}
			else if (a >= 60)
			{
				return 1F;
			}
			else
			{
				return 0F;
			}
	}
	public static void Main()
	{
		int n;
		int i;
		int s;
		int[] a = new int[100];
		float SumGPA = 0F;
		float Points = 0F;
		float AveGPA = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		SumGPA = 0F;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			Points += s;
			a[i] = s;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = Integer.parseInt(tempVar3);
			}
			SumGPA += GPA(s) * a[i];
		}
		AveGPA = SumGPA / Points;
		System.out.printf("%.2f\n",AveGPA);
	}
}

