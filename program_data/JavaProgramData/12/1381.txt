package <missing>;

public class GlobalMembers
{
	//*****************************************
	//* ????? **
	//* ?????? 1300012741 **
	//* ???2013.10.23 **
	//*****************************************


	public static int Main()
	{
		int[] list = new int[15];
		int i;
		int j;
		int num;
		int sum;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (num != -1)
		{
			i = 1;
			j = 0;
			sum = 0;
			list[0] = num;
			while ((list[i], list[i]) != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				i++;
			}
			while (list[j] != 0)
			{
				for (i = j + 1; list[i] != 0; i++)
				{
					if (list[i] == 2 * list[j] || 2 * list[i] == list[j])
					{
						sum++;
					}
				}
				j++;
			}
			System.out.print(sum);
			System.out.print("\n");
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}
}

