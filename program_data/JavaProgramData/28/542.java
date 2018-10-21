package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String Words = new String(new char[3000]);
		int i = 0;
		int[] Cd = new int[300];
		int j = 0;
		int k = 0;
		Words = new Scanner(System.in).nextLine();
		int l = Words.length();
			for (i = 0;i < l;i++)
			{
				if (Words.charAt(i) != ' ')
				{
					if (k == 1)
					{
						j++;
					}
					Cd[j]++;
					k = 0;
				}
				else if (Words.charAt(i) == ' ')
				{
					k = 1;
				}
			}
			for (int t = 0;t < j;t++)
			{
				System.out.printf("%d,",Cd[t]);
			}
			System.out.printf("%d",Cd[j]);
			return 0;
	}

}
