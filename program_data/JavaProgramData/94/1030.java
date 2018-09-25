package <missing>;

public class GlobalMembers
{
	/*
	hw.cpp
	????yang?
	?????????
	???11.3
	*/
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int s = 0;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 == 1)
			{
				a[s] = x;
				s++;
			}
		} //???????????????a[]????s??
		for (int i = 0;i < s - 1;i++)
		{
			for (int j = i + 1;j < s;j++)
			{
				if (i < j && a[i]> a[j])
				{
					int swi = a[i];
					a[i] = a[j];
					a[j] = swi;
				}
			}
		} //?a[]??
		System.out.print(a[0]);
		for (int i = 1;i < s;i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		} //?????
		return 0;
	}
}

