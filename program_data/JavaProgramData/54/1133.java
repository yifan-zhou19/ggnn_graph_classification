package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int applesRemain;
		int count;
		double numDouble;
		int applesBefore;
		int mytry;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		count = 0; // count if appleBefore is valid, stop loop when count == n
		for (mytry = 1; count < n ; mytry++)
		{
			applesRemain = mytry; // try to initialize applesRemain by mytry, start from 1
			for (; count < n; count++)
			{
				numDouble = (applesRemain + k - (double)k / n) * n / (double)(n - 1); // from the relation between a(m) and a(m-1)
				applesBefore = (int)numDouble;

				if (numDouble - applesBefore > 0) // if applesBefore is not valid
				{
					count = 0; // reset count, try with next mytry
					break;
				}
				else
				{
					applesRemain = applesBefore; // continue calculation process, count++
				}
			}
		}

		System.out.printf("%d\n", applesRemain); // output result

		return 0;
	}

}

