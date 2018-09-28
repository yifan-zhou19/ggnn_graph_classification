package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		int[] sum = new int[4];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			age[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (age[i] >= 1 && age[i] <= 18)
			{
				sum[0]++;
			}
			else if (age[i] >= 19 && age[i] <= 35)
			{
				sum[1]++;
			}
			else if (age[i] >= 36 && age[i] <= 60)
			{
				sum[2]++;
			}
			else if (age[i] >= 61)
			{
				sum[3]++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)sum[0] * 100 / n);
		System.out.printf("19-35: %.2lf%%\n",(double)sum[1] * 100 / n);
		System.out.printf("36-60: %.2lf%%\n",(double)sum[2] * 100 / n);
		System.out.printf("60??: %.2lf%%",(double)sum[3] * 100 / n);
		return 0;
	}
}

