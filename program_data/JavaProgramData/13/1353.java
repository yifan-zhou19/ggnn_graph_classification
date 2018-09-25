package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] number;
		int i;
		int j;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		number = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
		}

		i = 0;
		while ((i < n) && (sum != 0))
		{
			if ((i == n - 1) && (number[i] != 0))
			{
				System.out.printf("%d",number[i]);
			}
			sum = 0;
			for (j = i + 1;j < n;j++)
			{
				if (number[j] == number[i])
				{
					number[j] = 0;
				}
				sum += number[j];
			}

			if ((sum != 0) && (number[i] != 0))
			{
				System.out.printf("%d ",number[i]);
			}
			else if ((sum == 0) && (number[n - 1] == 0))
			{
				System.out.printf("%d",number[i]);
				sum = 0;
			}
			i++;

		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(number);
		return 0;
	}

}

