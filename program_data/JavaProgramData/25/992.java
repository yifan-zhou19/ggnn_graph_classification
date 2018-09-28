package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		a[0] = 1;
		int p = 0;
		int temp;
		int i1;
		if (n != 0)
		{
			for (int i = 0;i < n;i++)
			{
				for (i1 = 0;i1 <= 99;i1++)
				{
					temp = a[i1] * 2 + p;
					b[i1] = temp % 10;
					a[i1] = b[i1];
					p = temp / 10;
				}
			} //??????
			int t = 0;
			int i2;
			for (i2 = 99;i2 >= 0;i2--)
			{
				if (b[i2] == 0)
				{
					continue;
				}
				else if (b[i2] != 0)
				{
					break;
				}
			}
			for (int i3 = i2;i3 >= 0;i3--)
			{
				System.out.print(b[i3]);
			}
		}
		else
		{
			System.out.print(1);
		}
		return 0;
	}
}

