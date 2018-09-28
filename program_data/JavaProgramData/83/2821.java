package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[101];
		int[] b = new int[101];
		int sum = 0;
		float gpa = 0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
			gpa += 4 * a[i];
			}
			else if (b[i] >= 85 && b[i] <= 89)
			{

				gpa += 3.7 * a[i];
			}
			else if (b[i] >= 82 && b[i] <= 84)
			{
				gpa += 3.3 * a[i];
			}
			else if (b[i] >= 78 && b[i] <= 81)
			{
				gpa += 3.0 * a[i];
			}
			else if (b[i] >= 75 && b[i] <= 77)
			{
				gpa += 2.7 * a[i];
			}
			else if (b[i] >= 72 && b[i] <= 74)
			{
				gpa += 2.3 * a[i];
			}
			else if (b[i] >= 68 && b[i] <= 71)
			{
				gpa += 2.0 * a[i];
			}
			else if (b[i] >= 64 && b[i] <= 67)
			{
				gpa += 1.5 * a[i];
			}
			else if (b[i] >= 60 && b[i] <= 63)
			{
				gpa += 1.0 * a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		System.out.printf("%.2f\n",gpa / sum);
	}

}

