package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int flag;


		flag = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (flag != -1)
		{
			a[0] = flag;
			int i = 0;
			int count = 0;

			while (a[i] != 0)
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			for (int j = 0; j < i; j++)
			{
				for (int k = 0; k < i; k++)
				{
					if (a[j] == 2 * a[k])
					{
					count++;
					}
				}
			}

			System.out.print(count);
			System.out.print("\n");

			flag = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}
}

