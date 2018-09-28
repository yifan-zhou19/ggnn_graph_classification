package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int isfirst = 1;
		String word = new String(new char[1000]);
		while (scanf("%s", word) != EOF)
		{
			if (isfirst == 1)
			{
				isfirst = 0;
			}
			else
			{
				System.out.print(",");
			}
			System.out.printf("%d",word.length());
		}
		System.out.print("\n");
		return 0;
	}

}
