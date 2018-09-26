package <missing>;

public class GlobalMembers
{
	/*        ????
	??:???        2010.11.03    */
	public static int Main()
	{
		int[] a = new int[25]; //row????line???
		int[] row = new int[25];
		int[] line = new int[25];
		int i;
		int s;
		int t;
		int j;
		for (i = 0; i < 25; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			row[i] = i / 5 + 1;
			line[i] = i % 5 + 1; //?????
		}
		s = 0; //???????
		for (i = 0; i < 25; i++)
		{
			t = 0; //??a[i]?????
			for (j = 0; j < 25; j++)
			{
				if (row[j] == row[i])
				{
					if (a[j] > a[i])
					{
						t = 1;
					}
				}
				if (line[j] == line[i])
				{
					if (a[j] < a[i])
					{
						t = 1;
					}
				}
			}
			if (t == 0)
			{
				System.out.print(row[i]);
				System.out.print(" ");
				System.out.print(line[i]);
				System.out.print(" ");
				System.out.print(a[i]);
				System.out.print("\n");
				s = 1;
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}









}

