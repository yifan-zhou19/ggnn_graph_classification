package <missing>;

public class GlobalMembers
{
	//********************************
	//*???5.cpp   **
	//*????????   **
	//*?????? 1300012838 **
	//*???2013.10.30  **
	//********************************

	public static int Main()
	{
		int[] time = new int[1000];
		int[] in = new int[1000];
		int[] out = new int[1000];
		int num = 1;
		int max = 0;
		for (int i = 0; i < 1000; i++)
		{
			time[i] = 0;
		}
		in[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			in[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++;
		}
		for (int j = 0; j < num; j++)
		{
			out[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int k = in[j]; k < out[j]; k++)
			{
				time[k]++;
			}
			System.in.read();
		}
		for (int l = 0; l < 1000; l++)
		{
			if (time[l] > max)
			{
				max = time[l];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}
}

