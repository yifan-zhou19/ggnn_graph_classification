package <missing>;

public class GlobalMembers
{
	//********************************************
	//*3�D�?o&#213;D&#198;&#184;&#187;��&#203;�y                          *
	//*D&#213;&#195;&#251;?oo&#206;&#212;&#198;&#198;e                              *
	//*&#209;�o&#197;?o1300012888                          *
	//*�&#213;&#198;�?o2013.11.5                           *
	//********************************************

	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] t = new int[1000];
		int n;
		int i;
		int tmax;

		tmax = INT_MIN;
		i = 1;
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		n = i - 1;
		for (i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		for (i = 0;i <= 999;i++)
		{
			t[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			for (;a[i] <= b[i] - 1;a[i]++)
			{
				t[a[i]]++;
			}
		}
		for (i = 0;i <= 999;i++)
		{
			if (t[i] > tmax)
			{
				tmax = t[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(tmax);
		System.out.print("\n");

		return 0;
	}
}

