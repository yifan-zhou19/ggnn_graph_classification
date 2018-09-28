package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		int x;
		int j = 0;
		int k = 0;
		int m = 0;
		for (i = 0;((a[i] = System.in.read()) != ' ');i++)
		{
			j++;
		}
		for (i = 0;((b[i] = System.in.read()) != '\n');i++)
		{
			k++;
		}
		if (j != k)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				for (x = 0;x < j;x++)
				{
					if (b.charAt(x) == a.charAt(i))
					{
						b = tangible.StringFunctions.changeCharacter(b, x, '0');
						break;
					}
				}
			}
			for (i = 0;i < j;i++)
			{
				if (b.charAt(x) == '0')
				{
				m++;
				}
			}
		if (m == j)
		{
			System.out.print("YES");
		}
		else
		{
		System.out.print("NO");
		}
		}
	}
}

