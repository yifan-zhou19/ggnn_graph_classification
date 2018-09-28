package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] tianji = new int[10100];
		int[] king = new int[10100];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			i = 0;
			while (i < n)
			{
				tianji[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			i = 0;
			while (i < n)
			{
				king[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tianji,tianji + n);
			sort(king,king + n);
			int b1;
			int e1;
			int b2;
			int e2;
			int score = 0;
		   // cout<<"%"<<score<<endl;
			b1 = 0;
			e1 = n - 1;
			b2 = 0;
			e2 = n - 1;
			while (b1 <= e1)
			{
				if (tianji[e1] > king[e2])
				{
					score += 200;
					e1--;
					e2--;
				}
				else if (tianji[e1] < king[e2])
				{
					score -= 200;
					e2--;
					b1++;
				}
				else
				{
					if (tianji[b1] != king[b2] && b1 <= e1)
					{
									while (tianji[b1] != king[b2] && b1 <= e1)
									{
						if (tianji[b1] > king[b2])
						{
							b1++;
							b2++;
							score += 200;
						}
						else
						{
							b1++;
							e2--;
							score -= 200;
						}
									}
					}
					else if (b1 < e1 && tianji[b1] == king[b2])
					{
						if (tianji[b1] < king[e2])
						{
							score -= 200;
						}
						b1++;
						e2--;
					}
					else if (b1 == e1)
					{
						break;
					}
				}
			}
			System.out.print(score);
			System.out.print("\n");
		}
		return 0;
	}

}

