package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int la;
		int lb;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] c = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			la = a.length();
			lb = b.length();
			for (i = la - 1,j = lb - 1,k = 0;j >= 0;i--,j--,k++)
			{
				if (a.charAt(i) >= b.charAt(j))
				{
					c[k] = a.charAt(i) - b.charAt(j);
				}
				else
				{
					c[k] = a.charAt(i) - b.charAt(j) + 10;
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
				}
			}
			for (;i >= 0;i--,k++)
			{
				c[k] = a.charAt(i) - '0';
			}
			for (i = k - 1;i >= 0;i--)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
			n--;
		}
		return 0;
	}
}

