package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int final_g;
		int class_g;
		int nPapers;
		int scholarship;
		int max_s;
		int sum;
		char isCadre;
		char isWest;
		String buffer = new String(new char[21]);
		String name = new String(new char[21]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		sum = 0;
		max_s = 0;
		for (i = 0; i < N; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				buffer = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				final_g = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				class_g = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				isCadre = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				isWest = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				nPapers = Integer.parseInt(tempVar7);
			}
			scholarship = 0;
					if (final_g > 80 && nPapers > 0)
					{
				scholarship += 8000;
					}
					if (final_g > 85 && class_g > 80)
					{
				scholarship += 4000;
					}
					if (final_g > 90)
					{
				scholarship += 2000;
					}
					if (final_g > 85 && isWest == 'Y')
					{
				scholarship += 1000;
					}
					if (class_g > 80 && isCadre == 'Y')
					{
				scholarship += 850;
					}

			if (scholarship > max_s)
			{
				name = buffer;
				max_s = scholarship;
			}
			sum += scholarship;
		}
		System.out.printf("%s\n%d\n%d\n", name, max_s, sum);

		return 0;
	}

}

