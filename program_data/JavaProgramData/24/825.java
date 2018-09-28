package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		int start;
		int i = 0;
		int max = 0;
		int z = 0;
		int big = 0;
		int small = 100;
		int min = 0;
		while (s.charAt(i) != '\0')
		{
			int total = 0;
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
			{
				start = i;
				z++;
				while ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
				{
					total++;
					i++;
				}
				if (total > big)
				{
					max = start;
					big = total;
				}
				if (total < small)
				{
					min = start;
					small = total;
				}
			}
			else
			{
				i++;
			}
		}
		i = max;
		while ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
		{
			System.out.printf("%c",s.charAt(i));
			i++;
		}
		System.out.print("\n");
		i = min;
		while ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
		{
			System.out.printf("%c",s.charAt(i));
			i++;
		}
		return 0;
	}
}
