package <missing>;

public class GlobalMembers
{
	public static float GPA;
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static gpa(int m,int a)
	{
		if (m >= 90 && m <= 100)
		{
		GPA = 4.0 * a;
		}
		else if (m >= 85 && m <= 89)
		{
		GPA = 3.7 * a;
		}
		else if (m >= 82 && m <= 84)
		{
		GPA = 3.3 * a;
		}
		else if (m >= 78 && m <= 81)
		{
		GPA = 3.0 * a;
		}
		else if (m >= 75 && m <= 77)
		{
		GPA = 2.7 * a;
		}
		else if (m >= 72 && m <= 74)
		{
		GPA = 2.3 * a;
		}
		else if (m >= 68 && m <= 71)
		{
		GPA = 2.0 * a;
		}
		else if (m >= 64 && m <= 67)
		{
		GPA = 1.5 * a;
		}
		else if (m >= 60 && m <= 63)
		{
		GPA = 1.0 * a;
		}
		else if (m < 60)
		{
		GPA = 0F;
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		 for (i = 0;i < n;i++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		 }
		System.out.print("\n");
		float g = 0F;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			gpa(b[i], a[i]);
			g += GPA;
			sum += a[i];
		}
		GPA = g / sum;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

