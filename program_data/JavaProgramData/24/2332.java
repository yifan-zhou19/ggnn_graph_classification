package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l = 0;
		int max = 0;
		int min = 20;
		int count = 0;
		String word = new String(new char[1000]);
		String big;
		String small;
		while ((word[l] = System.in.read()) != '\n')
		{
			l++;
		}
		for (i = 0;i < l;i++)
		{
			if (word.charAt(i) == ',' || word.charAt(i) == ' ')
			{
				if (count > max)
				{
					max = count;
					big = word.charAt(i - count);
				}
				if (count < min)
				{
					min = count;
					small = word.charAt(i - count);
				}
				count = 0;
				if (word.charAt(i) == ',')
				{
					i++;
				}
			}
			else
			{
				count++;
			}
		}
		if (count > max)
		{
			max = count;
			big = word.charAt(i - count);
		}
		if (count < min)
		{
			min = count;
			small = word.charAt(i - count);
		}
		int x;
		int y;
		for (x = 0;x < max;x++)
		{
			System.out.print((big.Substring(x)));
		}
		System.out.print("\n");
		for (y = 0;y < min;y++)
		{
			System.out.print((small.Substring(y)));
		}
		System.out.print("\n");
		return 0;
	}

}
