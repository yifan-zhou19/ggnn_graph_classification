package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????    **
	//*?????? 1300012757 **
	//*???2013.10.30 **
	//********************************
	public static int Main()
	{
		int in;
		in = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (in != -1)
		{
		int[] a = new int[15];
		int i = 0;
		int num;
		int count = 0;
		while (in != 0)
		{
			a[i] = in;
			i++;
			in = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = i;
		for (int p = 0; p < num ; p++)
		{
			if (a[p] % 2 == 1)
			{
				continue;
			}
			for (int q = 0; q < num ; q++)
			{
				if (a[p] == a[q] * 2)
				{
					count++;
				}
			}
		}
			System.out.print(count);
			System.out.print("\n");
			in = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

