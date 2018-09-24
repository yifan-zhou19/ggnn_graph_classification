package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[26];
		String s = new String(new char[300]);
		char[] l = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char f = 0;

		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}

		for (i = 0;i < 300;i++)
		{
	if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
	{
	a[s.charAt(i) - 'a']++;
	}
	else if (s.charAt(i) == 0)
	{
		break;
	}
		}

		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",l[i],a[i]);
				f = 1;
			}
		}
	if (f == 0)
	{
		System.out.println("No");
	}
	}
}
