package <missing>;

public class GlobalMembers
{
	public static int compare(char a, String b, String c)
	{
		int z;
		int i;
		int j = 0;
		int k = 0;
		for (i = 0; !b[i].equals('\0');i++)
		{
			if (b[i].equals(a))
			{
				j++;
			}
			if (c[i].equals(a))
			{
				k++;
			}
		}
		if (j != k)
		{
			z = 0;
		}
		else
		{
			z = 1;
		}
		return (z);
	}
	public static void Main()
	{
		char a;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i;
		int s;
		int j;
		int k;
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
		j = s1.length();
		k = s2.length();
		if (j != k)
		{
			System.out.print("NO");
		}
		else
		{
				for (a = '!';a <= '~';a++)
				{
					s = compare(a, s1, s2);
					if (s == 0)
					{
						System.out.print("NO");
						break;
					}
				}
				if (s == 1)
				{
					System.out.print("YES");
				}
		}
	}
}

