package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		char b;
		int i1 = 0;
		int i2 = 0;
		while (cin.get(b) && b != '\n')
		{
			if (b != 32)
			{
				a.charAt(i1)[i2++] = b; //????
			}
			else if (b == 32)
			{
				i1++,i2 = 0; //???????
			}
		}
		for (int d = i1;d >= 1;d--)
		{
			System.out.print(a.charAt(d));
			System.out.print(" ");
		}
		System.out.print(a.charAt(0));
		return 0;
	}
}
