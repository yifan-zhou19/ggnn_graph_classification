package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
		char c;
		String max;
		String min;
		String p;
		int i;
		int word = 0;
		int lmax = 0;
		int lmin = 100;
		int a;
		s = new Scanner(System.in).nextLine();
		for (i = 0;(c = s.charAt(i)) != '\0';i++)
		{
			if (c != ' ')
			{
				if (word == 0)
				{
					a = 1;
					p = s.Substring(i);
					word = 1;
				}
				else
				{
					a++;
				}
			}
			if (c == ' ' || s.charAt(i + 1) == '\0')
			{
				if (word == 1)
				{
				   if (a > lmax)
				   {
						max = p;
						lmax = a;
				   }
				   if (a < lmin)
				   {
						min = p;
						lmin = a;
				   }
				}
				word = 0;
			}
		}
		while (max != ' ' && max != '\0')
		{
			System.out.print(*(max++));
		}
		System.out.print('\n');
		while (min != ' ' && min != '\0')
		{
			System.out.print(*(min++));
		}
	}

}
