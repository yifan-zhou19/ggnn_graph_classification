package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[1000]);
		zfc = new Scanner(System.in).nextLine();
		int k = zfc.length();
		int i;
		int count = 0;
		int p;
		int min1 = 0;
		int min = 1000;
		int max = 0;
		int max1 = 0;
		for (i = 0;i < k;i++)
		{
			if (zfc.charAt(i) != 32)
			{
				count = count + 1;
			}
			else
			{
				if (max < count)
				{
					max = count;
					max1 = i - 1;
				}
				if (min > count)
				{
					min = count;
					min1 = i - 1;
				}
				count = 0;
				p = i;
			}





		}
		count = k - 1 - p;
		if (max < count)
		{
					max = count;
					max1 = i - 1;
		}
				if (min > count)
				{
					min = count;
					min1 = i - 1;
				}

		for (i = max1 - max + 1;i <= max1;i++)
		{
			System.out.printf("%c",zfc.charAt(i));
		}
		System.out.print("\n");
		for (i = min1 - min + 1;i <= min1;i++)
		{
			System.out.printf("%c",zfc.charAt(i));
		}
		return 0;
	}
}
