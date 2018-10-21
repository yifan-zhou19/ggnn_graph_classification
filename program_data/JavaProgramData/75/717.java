package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000]; //????????
		int[] y = new int[1000];
		int cnt = 0;
		int[] man = new int[1000];
		int manmax = 0;
		int xmin;
		int ymax;
		xmin = INT_MAX; //???
		ymax = INT_MIN;
		char ch;
		for (int q = 0; q <= 1000; q++) //????????ch??","???
		{
			x[q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			cnt++; //?????
			if (ch != ',')
			{
				break;
			}
		}
		for (int o = 0; o <= 1000; o++)
		{
			y[o] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (int w = 0; w < cnt; w++) //??????????
		{
			if (x[w] <= xmin)
			{
				xmin = x[w];
			}
		}
		for (int z = 0; z < cnt; z++) //??????????
		{
			if (y[z] >= ymax)
			{
				ymax = y[z];
			}
		}

		for (int i = xmin; i < ymax; i++) //?????????????????
		{
			for (int j = 0; j < cnt; j++)
			{
				if (x[j] <= i != 0 && y[j] > i)
				{
					man[i]++;
				}
			}
		}

		for (int t = xmin; t < ymax; t++) //??????????????
		{
			if (man[t] >= manmax)
			{
				manmax = man[t];
			}
		}
		System.out.print(cnt);
		System.out.print(" ");
		System.out.print(manmax);
		return 0;
	}





}

