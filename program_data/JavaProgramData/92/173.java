package <missing>;

public class GlobalMembers
{
	public static int[] Tj = new int[1001];
	public static int[] Qw = new int[1001];
	public static int cmp(Object a, Object b)
	{
		return ((int)a - (int)b);
	}
	public static int Main()
	{
		int N;
		int i;
		int j;
		int temp = 200;
		int count = 0;
		while ((N != 0 && N != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
				count = N;
				int start1 = 0;
				int start2 = 0;
				int end1 = N - 1;
				int end2 = N - 1;
				int win = 0;
				int lose = 0;
			for (i = 0; i < N; i++)
			{
				Tj[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(Tj,N,(Integer.SIZE / Byte.SIZE),cmp);

			for (i = 0; i < N; i++)
			{
				Qw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(Qw,N,(Integer.SIZE / Byte.SIZE),cmp);
			while (count-- != 0)
			{
				if (Tj[start1] > Qw[start2])
				{
					start1++;
					start2++;
					win++;
				}
				else if (Tj[end1] > Qw[end2])
				{
					end1--;
					end2--;
					win++;
				}
				else if (Tj[start1] < Qw[start2])
				{
					start1++;
					end2--;
					lose++;
				}
				else if (Tj[end1] < Qw[end2])
				{
					start1++;
					end2--;
					lose++;
				}
				else if (Tj[end1] == Qw[end2])
				{
					if (Tj[start1] < Qw[end2])
					{
						start1++;
						end2--;
						lose++;
					}
				}
			}


		  int sum = temp * (win - lose);
		  System.out.print(sum);
		  System.out.print("\n");
		}
		return 0;
	}
}

