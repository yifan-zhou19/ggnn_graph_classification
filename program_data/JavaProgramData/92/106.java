package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] king_horse = new int[1010];
		int[] tian_horse = new int[1010];
		int king_head;
		int tian_head;
		int king_tail;
		int tian_tail;
		int n = 0;
		int i = 0;
		int sum = 0;
		int flag = 0;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			sum = 0;
			flag = 0;
			for (i = 0; i < n; i++)
			{
				tian_horse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				king_horse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tian_horse, tian_horse + n);
			sort(king_horse, king_horse + n);
			king_head = tian_head = 0;
			king_tail = tian_tail = n - 1;
			while (king_head <= king_tail != 0 && tian_head <= tian_tail)
			{
				if (tian_horse[tian_tail] > king_horse[king_tail])
				{
					sum = sum + 200;
					tian_tail--;
					king_tail--;
				}
				else
				{
					while (king_head <= king_tail != 0 && tian_head <= tian_tail)
					{
						if (tian_horse[tian_head] > king_horse[king_head])
						{
							sum = sum + 200;
							tian_head++;
							king_head++;
						}
						else
						{
							if (tian_horse[tian_head] < king_horse[king_tail])
							{
								sum = sum - 200;
							}
							tian_head++;
							king_tail--;
							break;
						}
					}
				}
				if (tian_horse[tian_head] > king_horse[king_tail])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				sum = sum + (tian_tail - tian_head + 1) * 200;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

