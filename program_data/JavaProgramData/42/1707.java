package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] shu = new int[n];
		for (int i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shu[i] = x;
		} //???????&??
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int m = 0,b = 0;m < n;m++)
		{
			if (b == 0)
			{
				if (shu[m] != k)
				{
					System.out.print(shu[m]);
					b = 1;
				} //diyigeshuziqianmianmeiyoukongge
			}
			else
			{
				if (shu[m] != k)
				{
					System.out.print(" ");
					System.out.print(shu[m]);
				}
			}

		}




		return 0;

	}

}

