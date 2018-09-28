package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num_classes;
		num_classes = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] pts = new int[10];
		for (int i = 0; i < num_classes; i++)
		{
			pts[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int total_score = 0;
		int total_credits = 0;
		int tmp;
		for (int i = 0; i < num_classes; i++)
		{
			tmp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total_credits += pts[i];
			if (tmp >= 90)
			{
				total_score += 40 * pts[i];
			}
			else if (tmp >= 85)
			{
				total_score += 37 * pts[i];
			}
			else if (tmp >= 82)
			{
				total_score += 33 * pts[i];
			}
			else if (tmp >= 78)
			{
				total_score += 30 * pts[i];
			}
			else if (tmp >= 75)
			{
				total_score += 27 * pts[i];
			}
			else if (tmp >= 72)
			{
				total_score += 23 * pts[i];
			}
			else if (tmp >= 68)
			{
				total_score += 20 * pts[i];
			}
			else if (tmp >= 64)
			{
				total_score += 15 * pts[i];
			}
			else if (tmp >= 60)
			{
				total_score += 10 * pts[i];
			}
		}
		System.out.printf("%.2f",(float)total_score / (float)(total_credits * 10));
	}
}

