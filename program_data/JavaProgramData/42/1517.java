package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] number = new int[NUMBER];
		int i = 0;
		int count = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		int k;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		i = 0;
		int j = 0;
		while (i < n)
		{
			if (number[i] == k)
			{
				count++;
				while ((i + j) < n)
				{
				   number[i + j] = number[i + j + 1];
				   j++;
				}
			}
			else
			{
				i++;
			}
			j = 0;

		}
		i = 0;
		while (i < (n - count))
		{
			if (i == 0)
			{
				System.out.printf("%d", number[i]);
				i++;
			}
			else
			{
				System.out.printf(" %d", number[i]);
				i++;
			}
		}



		return 0;
	}
}

