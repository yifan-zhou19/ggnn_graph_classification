package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????             **
	//*?????? 1300012773      **
	//*???2013.10.30             **
	//********************************
	public static int[] x = new int[1000];
	public static int[] y = new int[1000];
	public static int[] t = new int[1000];
	public static int Main()
	{

		int num;
		int h = 1;
		int max = 1;
		char ch;
		int T = 0;

		for (num = 0;;)
		{
			x[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t[x[num]]++;
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
			num++;

		}

		System.out.print(num + 1);

		for (int i = 0; i <= num; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t[y[i]]--;
			ch = System.in.read();
		}
		for (int i = 0; i < 1000; i++)
		{
			T += t[i];
			if (T > max)
			{
				max = T;
			}
		}

		System.out.print(' ');
		System.out.print(max);
		return 0;
	}

}

