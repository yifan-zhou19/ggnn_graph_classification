package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[2000]);
		int i;
		int max = 0;
		int min = 100;
		int a;
		int b;
		int l;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != ',')
			{
				k++;
			}
			if (i == l - 1 || (s.charAt(i) == ' ' || s.charAt(i) == ','))
			{
				if (k != 0)
				{
					if (k > max)
					{
						max = k;
						if (i == l - 1)
						{
							a = i;
						}
						else
						{
							a = i - 1;
						}
					}
					if (k < min)
					{
						min = k;
						if (i == l - 1)
						{
							b = i;
						}
						else
						{
							b = i - 1;
						}
					}
				k = 0;
				}
			}
		}
		for (i = a - max + 1;i <= a;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = b - min + 1;i <= b;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
	}
}
