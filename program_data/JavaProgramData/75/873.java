package <missing>;

public class GlobalMembers
{
	//*********************************
	//* ????????              *
	//* ?????                    *
	//* ???12?25?                *
	//*********************************
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int total = 0;
		int n = 0;
		char ch = 0;
		int[] time = new int[1001];
		int i;
		int j;
		do
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(ch);
			x[total] = n; //x?????
			total++; //total??????
		}while (ch == ',');
		total = 0;
		do
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(ch);
			y[total] = n; //y?????
			total++;
		}while (ch == ',');
		System.out.print(total);
		System.out.print(" ");
		for (i = 0;i < total;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				time[j]++; //time??????????
			}
		}
		int t = 0;
		for (i = 0;i < 1001;i++)
		{
			if (time[i] > t)
			{
				t = time[i]; //????
			}
		}
		System.out.print(t);
		return 0;
	}
}

