package <missing>;

public class GlobalMembers
{
	//?? - 1134 ??
	//2010?11?05?
	//1000012753 ???


	public static int Main()
	{
		int N;
		int num;
		int i;
		int j;
		int k;
		int[] a = new int[200];

		for (k = 1; ; k++)
		{
			i = 0;

			while (true)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				if (a[0] == -1)
				{
					return 0;
				}
				if (a[i] == 0)
				{
					break;
				}

				i++;
			}

			num = 0;

			for (i = 0; a[i] != 0; i++)
			{
				N = i;
			}

			for (i = 0; i <= N; i++)
			{
				for (j = i + 1; j <= N; j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						num++;
					}
				}
			}

			System.out.print(num);
			System.out.print("\n");
		}

		return 0;
	}


}

