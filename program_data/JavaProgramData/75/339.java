package <missing>;

public class GlobalMembers
{
	/*????:?????
	 *??:???
	 *??:2010/11/26
	 *??:1000010449
	*/
	public static int Main()
	{
		int[] x = new int[5000];
		int[] y = new int[5000];
		int total;
		int count = 0;
		int max = 0;
		//x,y?????;total???;count?????????;max????
		int i;
		int j;

		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		total = 1;
		while (System.in.read() != '\n') //???????
		{
			x[total] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total++;
		}

		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		total = 1;
		while (System.in.read() != '\n') //???????
		{
			y[total] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total++;
		}


		for (j = 0; j < total; j++) //????????????
		{
			count = 0; //?????????,????0
			for (i = 0; i < total; i++)
			{
				if (x[j] >= x[i] != 0 && x[j] < y[i]) //?i????
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}

		System.out.print(total);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}





}

