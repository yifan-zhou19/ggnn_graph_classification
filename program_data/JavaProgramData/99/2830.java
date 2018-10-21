package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{

			if (age[i] <= 18)
			{
				a = a + 1;
			}
			else if (age[i] <= 35 && age[i] >= 19)
			{
				b = b + 1;
			}
			else if (age[i] <= 60 && age[i] >= 36)
			{
				c = c + 1;
			}
			else if (age[i] >= 61)
			{
				d = d + 1;
			}
		}
		System.out.printf("\n1-18: %.2f%%",(double)a / n * 100);
		System.out.printf("\n19-35: %.2f%%",(double)b / n * 100);
		System.out.printf("\n36-60: %.2f%%",(double)c / n * 100);
		System.out.printf("\n60??: %.2f%%",(double)d / n * 100);
		return 0;
	}
}

