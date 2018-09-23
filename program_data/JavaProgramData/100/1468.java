package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[400]);
		int i;
		int b = 0;
		int[] a = new int[100];
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				 a[s.charAt(i) - 'A']++;
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				a[s.charAt(i) - 'a' + 32]++;
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,a[i]);
				b++;
			}
		}
		if (b == 0)
		{
			System.out.print("No\n");
		}
	}

}
