package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[80]);
		String k = new String(new char[80]);
	s = new Scanner(System.in).nextLine();
	k = new Scanner(System.in).nextLine();
	for (n = 0;n < 81;n++)
	{
		if ((s.charAt(n) <= 'z') && (s.charAt(n) >= 'a'))
		{
		s.charAt(n) -= 32;
		}
	if ((k.charAt(n) <= 'z') && (k.charAt(n) >= 'a'))
	{
		k.charAt(n) -= 32;
	}
	}


	for (i = 0;i < 81;i++)
	{
		if (s.charAt(i) == k.charAt(i))
		{
			if ((s.charAt(i) == 0) && (k.charAt(i) == 0))
			{
				System.out.print("=");
				break;
			}
		else
		{
			continue;
		}
		}
	if (s.charAt(i) > k.charAt(i))
	{
		System.out.print(">");
		break;
	}
	if (s.charAt(i) < k.charAt(i))
	{
		System.out.print("<");
		break;
	}
	}
	return 0;
	}

}
