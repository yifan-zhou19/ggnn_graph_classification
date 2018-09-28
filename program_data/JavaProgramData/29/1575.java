package <missing>;

public class GlobalMembers
{
	/*******************????******************
	????
	******************************************/
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[n + 4];
			double sum = 0;
			a[1] = 1;
			a[2] = 2; //?????????
			for (int j = 3;j <= n + 3;j++)
			{
			   a[j] = a[j - 1] + a[j - 2];
			}
			for (int j = 1;j <= n;j++)
			{
				sum += (double)a[j + 1] / a[j];
				//cout <<sum<<endl;
			}
			System.out.printf("%.3f",sum);
			System.out.print("\n");
		}
		return 0;
	}

}

