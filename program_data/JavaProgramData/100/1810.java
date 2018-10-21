package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] time = new int[52];
		int k = 0;
		String zfc = new String(new char[300]);
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) <= 'Z' && zfc.charAt(i) >= 'A')
			{
				k++;
				time[zfc.charAt(i) - 'A']++;
			}
			if (zfc.charAt(i) <= 'z' && zfc.charAt(i) >= 'a')
			{
				k++;
				time[zfc.charAt(i) - 'a' + 26]++;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (time[i] > 0)
				{
				System.out.printf("%c=%d\n",'A' + i,time[i]);
				}
			}
			for (i = 26;i < 52;i++)
			{
				if (time[i] > 0)
				{
				System.out.printf("%c=%d\n",'a' + i - 26,time[i]);
				}
			}
		}
		return 0;
	}
}
