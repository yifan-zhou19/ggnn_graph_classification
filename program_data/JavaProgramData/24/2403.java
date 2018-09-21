package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j;
		int max = 0;
		int min = 1000;
		int t = 0;
		int len;
		int p = 1;
		int q = 1;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i <= len;i++)
		{
			if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z'))
			{
				t++;
			}
			else if ((a.charAt(i - 1) >= 'A' && a.charAt(i - 1) <= 'Z') || (a.charAt(i - 1) >= 'a' && a.charAt(i - 1) <= 'z'))
			{
				if (t < min)
				{
					p = i - t;
					min = t;
				}
				if (t > max)
				{
					q = i - t;
					max = t;
				}
				t = 0;
			}
		}
		for (i = q;i < max + q;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		for (i = p;i < p + min;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}

}
