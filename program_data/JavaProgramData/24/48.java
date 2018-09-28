package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int k;
		int p;
		int a;
		int m = 0;
		int n = 0;
		int max = 0;
		int min = 100;
		s = new Scanner(System.in).nextLine();
		a = s.length();
		for (i = 0;i <= a;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				m++;
			}
			else
			{
				if (m > max)
				{
					max = m;
					k = i - max;
					m = 0;
				}
				else
				{
					m = 0;
				}
			}
		}
		for (i = 0;i <= a;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				n++;
			}
			else
			{
				if (n < min)
				{
					min = n;
					p = i - min;
					n = 0;
				}
				else
				{
					n = 0;
				}
			}
		}
		for (i = k;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = p;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}
