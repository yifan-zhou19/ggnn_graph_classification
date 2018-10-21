package <missing>;

public class GlobalMembers
{
	public static int tag(char x)
	{
		if (x >= '0' && x <= '9')
		{
			return (0);
		}
		else if (x >= 'A' && x <= 'Z')
		{
			return (1);
		}
		else if (x >= 'a' && x <= 'z')
		{
			return (1);
		}
		else if (x == '_')
		{
			return (1);
		}
		else
		{
			return (2);
		}
	}
	public static void Main()
	{
		String a = new String(new char[30]);
		int n;
		int i = 1;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			a = new Scanner(System.in).nextLine();
			j = 0;
			l = a.length();
			while (a.charAt(j) != null)
			{
				if (tag(a.charAt(j)) == 2)
				{
					break;
				}
				j++;
			}
			if (j == l && tag(a.charAt(0)) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			i++;
		}
	}
}

