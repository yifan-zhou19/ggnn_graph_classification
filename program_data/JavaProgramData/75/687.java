package <missing>;

public class GlobalMembers
{
	/***************************************************
	?? ??? 1300017667
	?? 20101031
	?? ?????
	***************************************************/
	public static int Main()
	{
		int n = -1;
		int i;
		int t;
		int man = 0;
		int maxman = 0;
		char c;
		int[] start = new int[1000]; //???????????????
		int[] end = new int[1000];
		do
		{
			n++;
			start[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
		}while (c != '\n'); //???????????????????
		for (i = 0; i <= n; i++)
		{
			end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		for (t = 0; t <= 1000; t++)
		{
			for (i = 0; i <= n; i++)
			{
				if (t >= start[i] != 0 && t < end[i]) //????????
				{
					man++;
				}
			}
			if (man > maxman) //????????????????????????????????
			{
				maxman = man;
			}
			man = 0;
		}
		System.out.print(n + 1);
		System.out.print(" ");
		System.out.print(maxman);
		return 0;
	}



}

