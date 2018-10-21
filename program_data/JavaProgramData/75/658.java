package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????             **
	//*?????? 1300012965      **
	//*???2013.10.30             **
	//********************************
	public static int Main()
	{
		int num;
		int i;
		int j;
		int n;
		int m;
		int k;
		int temp;
		int[] start = new int[1000];
		int[] end = new int[1000];
		int[] time = new int[1000];
		char ch;
		start[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read(); //??????
		i = 0;
		while (ch == ',') //???????????
		{
			i++;
			start[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
		}
		end[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read();
		j = 0;
		while (ch == ',')
		{
			j++;
			end[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
		}
		System.out.print(i + 1);
		System.out.print(" ");
		for (n = 0; n <= i;n++)
		{
			for (k = start[n]; k < end[n]; k++)
			{
				time[k]++; //????????1
			}
		}
		for (m = 0; m <= 999; m++)
		{
			if (time[m] > time[m + 1])
			{
				temp = time[m];
				time[m] = time[m + 1];
				time[m + 1] = temp; //?????????????????
			}
		}
		System.out.print(time[999]);
		System.out.print("\n");
		return 0;
	}
}

