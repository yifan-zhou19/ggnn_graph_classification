package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = ""; //???????
		int i;
		for (i = 0;i < 100;i++)
		{
			cin.get(a.charAt(i));
			if (!(a.charAt(i - 1) == 32 && a.charAt(i) == 32))
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}
}
