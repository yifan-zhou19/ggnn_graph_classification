package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[301]);
		final String zm = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int[] number = new int[52];
		int p = 0;
		int k = 0;
		zfc = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < 52;i++)
		{
			number[i] = 0;
			for (k = 0;zfc.charAt(k) != '\0';k++)
			{
				if (zfc.charAt(k) == zm.charAt(i))
				{
					number[i]++;
				}
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (number[i] != 0)
			{
				p = 1;
				System.out.printf("%c=%d\n",zm.charAt(i),number[i]);
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
