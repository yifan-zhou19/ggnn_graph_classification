package <missing>;

public class GlobalMembers
{
	public static int cmp(Object e1, Object e2)
	{
		return *(int)e2 - (int)e1;
	}

	public static int Main()
	{
		int n;
		int[] King = new int[1000];
		int[] Tian = new int[1000];

		//??????
		int Win;
		//????
		int Lose;

		int begin;
		int end;

		int i;
		int j;
		while (true)
		{
			Win = 0;
			Lose = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{
				Tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				King[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}


			qsort(King,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(Tian,n,(Integer.SIZE / Byte.SIZE),cmp);
			//??
			begin = 0;
			end = n - 1;
			//??
			i = 0;
			j = n - 1;
			while (i <= j)
			{
				//win
				if (King[i] < Tian[begin])
				{
					Win++;
					begin++;
					i++;
				}

				//lose
				else if (King[i] > Tian[begin])
				{
					Lose++;
					i++;
					end--;
				}

				//tie
				else if (King[i] == Tian[begin])
				{
					while (King[j] < Tian[end] && j> i && end > begin)
					{
						Win++;
						end--;
						j--;
					}
					if (King[j] > Tian[end])
					{
						Lose++;
						i++;
						end--;
					}
					else if (King[j] == Tian[end])
					{
						if (King[i] > Tian[end])
						{
							Lose++;
							end--;
							i++;
						}
						else if (King[i] == Tian[end])
						{
							end--;
							i++;
						}
					}
				}
			}

			System.out.print((Win - Lose) * 200);
			System.out.print("\n");
		}

		return 0;
	}


}

