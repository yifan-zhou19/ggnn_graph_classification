package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int age;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		double on;
		double tw;
		double th;
		double fo;
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
				age = Integer.parseInt(tempVar2);
			}
			if (age < 19)
			{
				one++;
			}
			else if (age < 36)
			{
				two++;
			}
			else if (age < 61)
			{
				three++;
			}
			else
			{
				four++;
			}
		}
		on = (double)100 * one / n;
		tw = (double)100 * two / n;
		th = (double)100 * three / n;
		fo = (double)100 * four / n;
		System.out.printf("\n1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%",on,tw,th,fo);
	}
}

