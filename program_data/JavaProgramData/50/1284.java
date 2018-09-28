package <missing>;

public class GlobalMembers
{
	/*
	???:?????
	??:???
	????:2011.11.2
	*/
	public static int Main() //???
	{
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ??????????????
		int sum = 0;
		int i;
		int j = 1;
		int w;
		int[] day = new int[13];
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= 12 ; i++)
		{
			sum = sum + month[i - 1];
			day[j] = sum + 12; //???1.1????13????
			j++;
		}
		for (i = 1 ; i <= 12 ; i++)
		{
			day[i] = day[i] % 7;
			day[i] = (day[i] + w) % 7; //?????7???,?????
		}
		for (i = 1 ; i <= 12 ; i++)
		{
			if (day[i] == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

