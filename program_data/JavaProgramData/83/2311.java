package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float grade = 0F;
		float[] point = new float[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int j;
		for (j = 0;j < n;j++)
		{
			point[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		int i;

		int entry;
		int total = 0;
		float sum = 0F;
		for (i = 0;i < n;i++)
		{
			entry = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (entry >= 90)
			{
			grade = 4.0F;
			}
			else if (entry >= 85)
			{
			grade = 3.7F;
			}
			else if (entry >= 82)
			{
			grade = 3.3F;
			}
			else if (entry >= 78)
			{
			grade = 3.0F;
			}
			else if (entry >= 75)
			{
			grade = 2.7F;
			}
			else if (entry >= 72)
			{
			grade = 2.3F;
			}
			else if (entry >= 68)
			{
			grade = 2.0F;
			}
			else if (entry >= 64)
			{
			grade = 1.5F;
			}
			else if (entry >= 60)
			{
			grade = 1.0F;
			}
			else
			{
			grade = 0F;
			}
			sum += grade * point[i];
			total += point[i];
		}
		float average = sum / total;
		System.out.printf("%.2f", average);
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

