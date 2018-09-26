package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[1000]);
		char x;
		char y;
		int i = 0;
		int j;
		int n;
		int k = 1;
		while (scanf("%c", a.charAt(i)) == 1)
		{
			if (k != 0 && a.charAt(i) != a.charAt(0))
			{
				y = a.charAt(i);
				k = 0;
			}
			i++;
		}
		n = i - 1;
		x = a.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == y && a.charAt(i) != 0)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == x)
					{
						System.out.printf("%d %d\n",j,i);
						a = a.substring(0, j);
						a = a.substring(0, i);
						break;
					}
				}
			}
		}

	}
}
