package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[350]);
		int[] a = new int[26];
		int[] b = new int[26];
		int l;
		int i;
		int judge = 0;
		s = new Scanner(System.in).nextLine();
		l = s.length() - 1;
		for (i = 0;i <= 25;i++)
		{
			a[i] = b[i] = 0;
		}
		for (i = 0;i <= l;i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				a[s.charAt(i) - 65]++;
			}
			else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				b[s.charAt(i) - 97]++;
			}
		}
		for (i = 0;i <= 25;i++)
		{
			if (a[i] != 0 || b[i] != 0)
			{
				judge = 1;
			}
		}
		if (judge == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= 25;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%c=%d\n",65 + i,a[i]);
				}
			}
			for (i = 0;i <= 25;i++)
			{
				if (b[i] != 0)
				{
					System.out.printf("%c=%d\n",97 + i,b[i]);
				}
			}
		}
		return 0;
	}
}
