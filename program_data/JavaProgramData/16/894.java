package <missing>;

public class GlobalMembers
{
	//????007.cpp
	//??????
	//?????2013?10?25?
	//???????????

	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = n;
		for (i = 0;i < 5;i = i + 1)
		{
			a[i] = b[i] % 10;
			b[i + 1] = b[i] / 10;
			System.out.print(a[i]);
			if (b[i + 1] == 0)
			{
				break;
			}
		}
		return 0;
	}


}

