package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1005]);
		String mem = new String(new char[1005]);
		int[] num = new int[1005];
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		len = str.length();
		int i;
		int j;
		int m = 0;
		int n = 0;
		int sum = 0;
		for (i = 0;i < 1000;i++)
		{
			if (str.charAt(n) < 97)
			{
				mem = tangible.StringFunctions.changeCharacter(mem, m, str.charAt(n));
			}
			else
			{
				mem = tangible.StringFunctions.changeCharacter(mem, m, str.charAt(n) - 32);
			}
			for (j = n;j < len;j++)
			{
				if (str.charAt(j) == mem.charAt(m) || ((str.charAt(j) - mem.charAt(m)) == 32))
				{
					sum++;
				}
				if (str.charAt(j) != mem.charAt(m) && (str.charAt(j) - mem.charAt(m)) != 32 && j != len - 1)
				{
					num[m] = sum;
					sum = 0;
					n = j;
					break;
				}
				if (j == len - 1 && str.charAt(j) != mem.charAt(m) && (str.charAt(j) - mem.charAt(m)) != 32)
				{
					num[m] = sum;
					if (str.charAt(j) < 97)
					{
					mem = tangible.StringFunctions.changeCharacter(mem, m + 1, str.charAt(j));
					}
					else
					{
						mem = tangible.StringFunctions.changeCharacter(mem, m + 1, str.charAt(j) - 32);
					}
					num[m + 1] = 1;
					m += 2;
					n = len;
					break;
				}
				if (j == len - 1 && (str.charAt(j) == mem.charAt(m) || (str.charAt(j) - mem.charAt(m)) == 32))
				{
					num[m] = sum;
					m++;
					n = len;
					break;
				}
			}
			if (n < len - 1)
			{
				m++;
				continue;
			}
		}
		for (i = 0;i < m;i++)
		{
		System.out.print("(");
		System.out.print(mem.charAt(i));
		System.out.print(",");
		System.out.print(num[i]);
		System.out.print(")");
		}
		return 0;
	}
}

