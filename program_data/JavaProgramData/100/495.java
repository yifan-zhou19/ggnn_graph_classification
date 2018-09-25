package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[300]);
		String c2 = new String(new char[300]);
		int[] s = new int[300];
		int i;
		int j;
		int m;
		int n;
		c1 = new Scanner(System.in).nextLine();
		c2 = c1;
		n = c1.length();
		for (i = 0;i < n;i++)
		{
			if (c1.charAt(i) >= 97 && c1.charAt(i) <= 122)
			{
				break;
			}
		}
			if (i == n)
			{
				System.out.print("No");
			}
		for (i = 0,m = 0;i < n;i++,m++)
		{
			if (c1.charAt(i) >= 97 && c1.charAt(i) <= 122)
			{
				for (j = i + 1,s[m] = 1;j < n;j++)
				{
					if (c1.charAt(j) == c1.charAt(i))
					{
						s[m]++;
						c1 = tangible.StringFunctions.changeCharacter(c1, j, 32);
					}
				}
			}
			else
			{
				continue;
			}
		}
		for (m = 97;m <= 122;m++)
		{
			for (i = 0;i < n;i++)
			{
				if (c1.charAt(i) == m)
				{
					System.out.printf("%c=%d\n",c1.charAt(i),s[i]);
				}
				else
				{
					continue;
				}
			}
		}
	}


}

