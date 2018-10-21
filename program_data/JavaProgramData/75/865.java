package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] arrivetime = new int[1000];
		int[] leavetime = new int[1000];
		int i = 0;
		int j = 0;
		int k;
		int p;
		int q;
		do
		{
			arrivetime[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while (System.in.read() != '\n');
		do
		{
			leavetime[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
		}while (System.in.read() != '\n');
		int tpi;
		int Endtime;
		int Time;
		int bein = 0;
		int mostbein = 0;
		tpi = i;
		Endtime = leavetime[0];
		for (k = 1;k < i;k++)
		{
			if (Endtime < leavetime[k])
			{
				Endtime = leavetime[k];
			}
			else
			{
				continue;
			}
		}
		for (Time = 0;Time <= Endtime;Time++)
		{
			for (p = 0;p < i;p++)
			{
				if (arrivetime[p] == Time)
				{
					bein++;
				}
				else
				{
					continue;
				}
			}
			for (q = 0;q < i;q++)
			{
				if (leavetime[q] == Time)
				{
					bein--;
				}
				else
				{
					continue;
				}
			}
			if (mostbein < bein)
			{
				mostbein = bein;
			}
			else
			{
				continue;
			}
		}
		System.out.print(tpi);
		System.out.print(" ");
		System.out.print(mostbein);
		System.out.print("\n");
		return 0;
	}
}

