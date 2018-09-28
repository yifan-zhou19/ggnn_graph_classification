package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j = 0;
		int k;
		int[] piInput;
		int[] piOdd;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		piInput = new int[n];
		piOdd = new int[n];

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				piInput[i] = Integer.parseInt(tempVar2);
			}
			if (piInput[i] % 2 == 1)
			{
				piOdd[j++] = piInput[i];
			}
		}

		///sort
		for (i = 0; i < j; i++)
		{
			for (k = i + 1; k < j; k++)
			{
				if (piOdd[i] > piOdd [k])
				{
					n = piOdd[i];
					piOdd[i] = piOdd[k];
					piOdd[k] = n;
				}
			}
		}
		///print
		i = 0;
		System.out.printf("%d", piOdd[i]);
		for (i = 1; i < j; i++)
		{
				System.out.printf(",%d", piOdd[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(piInput);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(piOdd);

	}

}

