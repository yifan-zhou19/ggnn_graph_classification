package <missing>;

public class GlobalMembers
{
	public static void del(String s, char a)
	{
		int j = 0;
		while (!s[j].equals('\0'))
		{
			if (s[j].equals(a))
			{
				s[j] = ',';
				break;
			}
			else
			{
				j++;
			}
		}
	}
	public static void Main()
	{
		String s1 = new String(new char[20]);
		String s2 = new String(new char[20]);
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		n = s2.length();
		m = s1.length();
		if (n != m)
		{
			System.out.print("NO");
		}
		if (n == m)
		{
			for (i = 0;i < n;i++)
			{
			del(s1, s2.charAt(i));
			}
			for (i = 0;i < n;i++)
			{
			if (s1.charAt(i) != ',')
			{
					System.out.print("NO");
					break;
			}
			}
			if (i == n)
			{
				System.out.print("YES");
			}
		}
	}
}

