package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1;i > 0;i++)
		{ //i=the number of apples last monky get.
			int get = i; //the number of apples the last monky GET.
			for (int j = n - 1;j > 0;j--)
			{
				if ((get * n + k) % (n - 1) != 0)
				{
					get = 0; //get=0 meas this i is impossible.
					break;
				}
				get = (get * n + k) / (n - 1); //GET for monky j.
			}
			if (get != 0)
			{
				System.out.print((get * n + k));
				break;
			}
		}
	}

}

