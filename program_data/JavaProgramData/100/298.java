package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		int[] b = new int[150];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		m = i - 1;
		for (j = 97;j <= 122;j++)
		{
			n = 0;
			for (i = 0;i <= m;i++)
			{
				if (a.charAt(i) == j)
				{
					n = n + 1;
				}
			}
			b[j] = n;
		}
		n = 0;
		for (i = 97;i <= 122;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i,b[i]);
				n = 1;
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}
	}
}

