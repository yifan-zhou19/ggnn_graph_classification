package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[2001]);
		int start;
		int end;
		int max;
		int min;
		int i;
		int len;
		int zmax;
		int zmin;
		int maxstart;
		int minstart;
		zmax = 0;
		zmin = 100;
		words = new Scanner(System.in).nextLine();
		len = words.length();
		for (i = 0;i < len;i++)
		{
			while (words.charAt(i) == ' ')
			{
				i++;
			}
			start = i;
			while (words.charAt(i) != '\0' && words.charAt(i) != ' ')
			{
				i++;
			}
			end = i;
			max = end - start;
			min = end - start;
			if (max > zmax)
			{
				zmax = max;
				maxstart = start;
			}
			if (min < zmin)
			{
				zmin = min;
				minstart = start;
			}
		}
		while (words.charAt(maxstart) != '\0' && words.charAt(maxstart) != ' ')
		{
			System.out.printf("%c",words.charAt(maxstart));
			maxstart++;
		}
		System.out.print("\n");
		while (words.charAt(minstart) != '\0' && words.charAt(minstart) != ' ')
		{
			System.out.printf("%c",words.charAt(minstart));
			minstart++;
		}
		System.out.print("\n");
		return 0;
	}


}
