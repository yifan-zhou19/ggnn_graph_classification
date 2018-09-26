package <missing>;

public class GlobalMembers
{
	/*?????
	  ????????
	*/

	public static int Main()
	{
		int[] x = new int[1000]; //x,y?????????s??????
		int[] y = new int[1000];
		int[] s = new int[1001];
		int i = 0;
		int j = 0;
		char c;
		while (true)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
		while (true)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		} //??
		for (int m = 0;m < i;m++)
		{
			for (int n = x[m];n < y[m];n++)
			{
				s[n] += 1;
			} //??????
		}
		int max = 0;
		for (int p = 0;p < 1000;p++)
		{
			if (max < s[p])
			{
				max = s[p];
			}
		}
		System.out.print(i);
		System.out.print(' ');
		System.out.print(max);
	return 0;
	}

}

