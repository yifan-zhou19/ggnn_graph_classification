package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			int age;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
				if (age <= 18)
				{
					a = a + 1;
				}
				else if (age >= 19 && age <= 35)
				{
					b = b + 1;
				}
				else if (age >= 36 && age <= 60)
				{
					c = c + 1;
				}
				else if (age >= 61)
				{
					d = d + 1;
				}
		}
		System.out.printf("1-18: %.2f%%\n",(float)a * 100 / n);
		System.out.printf("19-35: %.2f%%\n",(float)b * 100 / n);
		System.out.printf("36-60: %.2f%%\n",(float)c * 100 / n);
		System.out.printf("60??: %.2f%%\n",(float)d * 100 / n);
		return 0;
	}

}

