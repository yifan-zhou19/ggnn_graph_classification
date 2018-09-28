package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] array_1 = new int[1005];
		int[] array_2 = new int[1005];
		int num;
		int count;
		int first;
		int last;
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (num == 0)
			{
				break;
			}
			count = 0;
			first = 0;
			last = num;
			for (int i = 0;i < num;i++)
			{
				array_1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < num;i++)
			{
				array_2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(array_1,array_1 + num);
			sort(array_2,array_2 + num);
			for (int i = 0;i < num;i++)
			{
				if (array_1[i] > array_2[first])
				{
					count = count + 200;
					first++;
				}
				else
				{
					while (array_1[num - 1] > array_2[last - 1] && num - 1 > i)
					{
						count = count + 200;
						num--;
						last--;
					}
					if (array_1[i] < array_2[last - 1])
					{
						count = count - 200;
						last--;
					}
					else
					{
					last--;
					}
				}

			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}


}

