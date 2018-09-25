package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] wrong = new int[60];
		int[] contine = new int[60];
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = 1;
			sum = 0;

			if (m == 0)
			{
				sum = 60; //m==0????
			}

			while (j <= m)
			{
				wrong[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				contine[j] = wrong[j] + 3 * j - 3;
				j++;
			}

			for (j = 1;j <= m;j++)
			{
				if ((contine[j] >= 57) && (contine[j] < 60))
				{
						sum = wrong[j];
						break;
				}
				else if (contine[j] >= 60)
				{
						sum = 60 - 3 * (j - 1);
						break;
				}
			}
			if (j == m + 1)
			{
				sum = 60 - 3 * m;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

