package <missing>;

public class GlobalMembers
{
	// Using recursive method

	public static int[] data = new int[1000];
	public static int n = 0;
	public static int m = 0;

	public static void cir_move(int dir, int left, int right, int step) // moving direction, 0 for left, 1 for right
	{
		/*
		cout << dir << ' ' << left << ' ' << right << ' ' << step << endl;
		for(int i = 1; i <= n; i++) cout << data[i] << ' ';
		cout << endl;
		cin.get();
		*/
		// for Debuging
		if ((left == right) || (step == 0))
		{
			return;
		}
		int len = right - left + 1; // calculate length
		step = step % len;
		if (step > len / 2) // Equivalent Transformation of Problem
		{
			cir_move(dir ^ 1, left, right, len - step);
			return;
		}
		int j = 0;
		int k = len - step;
		for (int i = left; i < left + step; i++)
		{
			j = data[i];
			data[i] = data[i + k];
			data[i + k] = j;
		}
		if (dir == 0) // move leftward
		{
			cir_move(dir, left, right - step, step);
		}
		else // move rightward
		{
			cir_move(dir, left + step, right, step);
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = m % n;
		for (int i = 1; i <= n; i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		cir_move(1, 1, n, m);
		System.out.print(data[1]);
		for (int i = 2; i <= n; i++)
		{
			System.out.print(' ');
			System.out.print(data[i]);
		}
	}
}

