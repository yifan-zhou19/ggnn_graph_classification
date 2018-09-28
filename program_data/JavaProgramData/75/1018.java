package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[][] a = new int[1000][2];
		int n = 0;
		int num = 0;

		while (true)
		{

			a[n][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			n++;

			if (System.in.read() != ',')
			{
				break;
			}
		}

		for (int i = 0;i < n;i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					System.in.read();
		}

		for (int i = 0;i < 1000;i++)
		{
			int tmp = 0;
			for (int j = 0;j < n;j++)
			{
				if (i >= a[j][0] != 0 && i < a[j][1])
				{
					tmp += 1;
				}
			}
			if (tmp > num)
			{
				num = tmp;
			}
		}

		System.out.print(n);
		System.out.print(' ');
		System.out.print(num);


		return 0;



	}
}

