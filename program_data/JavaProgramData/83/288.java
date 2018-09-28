package <missing>;

public class GlobalMembers
{
	public static float fGPA(int x)
	{
		if (x >= 90 && x <= 100)
		{
			return (4.0)F;
		}
		else if (x >= 85 && x <= 89)
		{
			return (3.7)F;
		}
		else if (x >= 82 && x <= 84)
		{
			return (3.3)F;
		}
		else if (x >= 78 && x <= 81)
		{
			return (3.0)F;
		}
		else if (x >= 75 && x <= 77)
		{
			return (2.7)F;
		}
		else if (x >= 72 && x <= 74)
		{
			return (2.3)F;
		}
		else if (x >= 68 && x <= 71)
		{
			return (2.0)F;
		}
		else if (x >= 64 && x <= 67)
		{
			return (1.5)F;
		}
		else if (x >= 60 && x <= 63)
		{
			return (1,0)F;
		}
		else
		{
			return (0)F;
		}
	}

	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] a = new int[10];
		int i;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}

		int[] b = new int[10];
		int j;
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}

		float GPA;
		float g = 0F;
		int k;
		for (k = 0;k < n;k++)
		{
			g = g + a[k] * (fGPA(b[k]));
		}
		GPA = g / sum;
		System.out.printf("%.2f",GPA);

	}


}

