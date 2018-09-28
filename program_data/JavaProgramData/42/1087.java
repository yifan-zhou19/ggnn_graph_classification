package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int del;
		int j;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //??
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != del && m == 1)
			{
				System.out.print(" ");
				m = 0;
			} //???????m??
			if (a[i] != del)
			{
				System.out.print(a[i]);
				if (m == 0)
				{
					m = 1; //m??????????
				}
			}
			else
			{
				continue;
			} //?????????

		}

		return 0;
	}
}

