package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int i;
		int max = 0;
		int min = 9999;
		int x;
		int y;
		int len;
		int p = 0;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (*(s.Substring(i)) == ' ')
			{
				if (p > max)
				{
					max = p;
					x = i - p;
				}
				if (p < min)
				{
					min = p;
					y = i - p;
				}
				p = 0;
			}
			else
			{
				p++;
			}
		}
		if (p > max)
		{
			max = p;
			x = i - p;
		}
		if (p < min)
		{
			min = p;
			y = i - p;
		}

		for (i = x; * (s.Substring(i)) != ' ' && *(s.Substring(i)) != '\0';i++)
		{
			System.out.printf("%c",*(s.Substring(i)));
		}
		System.out.print("\n");
		for (i = y; * (s.Substring(i)) != ' ' && *(s.Substring(i)) != '\0';i++)
		{
			System.out.printf("%c",*(s.Substring(i)));
		}


	}



}
