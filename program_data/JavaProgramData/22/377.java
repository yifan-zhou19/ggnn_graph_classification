package <missing>;

public class GlobalMembers
{
	public static int f(String t)
	{
		int i;
		int sum = 0;
		for (i = 0; !t[i].equals('\0');i++)
		{
			sum = sum * 10 + t[i] - '0';
		}
		return sum;
	}
	public static void Main()
	{
		String s = new String(new char[1600]);
		String t = new String(new char[6]);
		int a = 0;
		int b = 0;
		int[] c = new int[310];
		int i;
		int j;
		int m = 0;
		int n = 0;
		int k;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i <= l;i++)
		{
			if (s.charAt(i) == ',' || s.charAt(i) == '\0')
			{
				for (j = m,k = 0;j < i;j++,k++)
				{
					t = tangible.StringFunctions.changeCharacter(t, k, s.charAt(j));
				}
				t = tangible.StringFunctions.changeCharacter(t, k, '\0');
				m = i + 1;
				c[n] = f(t);
				n++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a < c[i] && b < c[i])
			{
				b = a;
				a = c[i];
			}
			else if (a > c[i] && b < c[i])
			{
				b = c[i];
			}
		}
		if (b != 0)
		{
			System.out.printf("%d\n",b);
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

