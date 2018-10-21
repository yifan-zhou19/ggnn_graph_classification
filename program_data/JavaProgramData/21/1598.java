package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:?????
	 ***??:2013?1?2?
	 *************************/
	public static int[] num = new int[301];
	public static int cmp(int a, int b)
	{
		if (num[a] < num[b])
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int sum = 0;
		int n;
		int i;
		int j;
		int[] max = new int[50];
		int max_sum = 0;
		double ava = 0;
		double distance = 0;
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		ava = sum * 1.0 / n; //???
		for (i = 0; i < n; i++)
		{
			t = Math.abs(ava - num[i]); //t?????????
			if (t - distance > 1e-4) //?????????
			{
				max_sum = 0;
				max[max_sum++] = i;
				distance = t; //????
				continue;
			}
			if (t - distance < -1e-4.getValue() != 0)
			{
				continue; //t?distance?,??
			}
			if (Math.abs(t - distance) < 1e-4)
			{
				max[max_sum++] = i;
			} //???????,???max_sum++
		}
		sort(max, max + max_sum - 1, cmp);
		System.out.print(num[max[0]]);
		for (i = 1; i < max_sum; i++)
		{
			System.out.print(",");
			System.out.print(num[max[i]]);
		}
		return 0;
	}


}

