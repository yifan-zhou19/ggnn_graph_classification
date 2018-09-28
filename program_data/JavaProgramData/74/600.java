package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 1;
		int a = 0;
		int number;
		int reversed_number = 0;
		int remainder = 0;
		int[] prime = new int[10000];
		int[] reversed = new int[10000];
		int[] result = new int[10000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					a = 0;
					break;
				}
				else
				{
					a = 1;
				}
			}
			if (a == 1)
			{
				prime[k] = i;
				k++;
			}
		}

		for (i = 1;i <= k;i++)
		{
			number = prime[i];
			reversed_number = 0;
			remainder = 0;

			while (number != 0)
			{
				remainder = number % 10;
				reversed_number *= 10;
				reversed_number += remainder;
				number /= 10;
			}

			reversed[i] = reversed_number;
			if (prime[i] == reversed[i])
			{
				result[i] = prime[i];
			}
			else
			{
				result[i] = 0;
			}

		}

		a = 0;
		for (i = 1;i <= k;i++)
		{
			if (result[i] != 0)
			{
				System.out.printf("%d",result[i]);
				j = i;
				a = 1;
				break;
			}
		}
		if (a == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = j + 1;i <= k;i++)
			{
				if (result[i] != 0)
				{
					System.out.printf(",%d",result[i]);
				}
			}
		}
		return 0;
	}











}

