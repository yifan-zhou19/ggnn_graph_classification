package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double a = 0; //??????
		double b = 0;
		double c = 0;
		double d = 0;
		char e = '%';
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] l = new int[n];
		for (i = 0; i < n; i++)
		{ //??????
			l[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (l[i] <= 18 && l[i] >= 1)
			{
				a++;
			}
			if (l[i] <= 35 && l[i] >= 19)
			{
				b++;
			}
			if (l[i] <= 60 && l[i] >= 36)
			{
				c++;
			}
			if (l[i] >= 61)
			{
				d++;
			}
		}
		a = 100 * a / n;
		b = 100 * b / n;
		c = 100 * c / n;
		d = 100 * d / n;
		System.out.printf("1-18: %.2f%c\n19-35: %.2f%c\n36-60: %.2f%c\n60??: %.2f%c", a, e, b, e, c, e, d, e);
		return 0;
	}
}

