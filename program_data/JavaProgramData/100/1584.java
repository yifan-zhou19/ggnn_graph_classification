package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char c;
		int[] b = new int[1000];
		int j;
		int i;
		int k;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i < 1000;i++)
		{
			b[i] = 0;
		}
		for (i = 65;i <= 90;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (a.charAt(j) == i)
				{
					b[i]++;
				}
			}
		}
		for (i = 97;i <= 122;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (a.charAt(j) == i)
				{
					b[i]++;
				}
			}
		}
		for (i = 65;i <= 90;i++)
		{
			if (b[i] != 0)
			{
				c = i;
				System.out.printf("%c=%d\n",c,b[i]);
			}
		}
		for (i = 97;i <= 122;i++)
		{
			if (b[i] != 0)
			{
				c = i;
				System.out.printf("%c=%d\n",c,b[i]);
			}
		}
		i = 65;
		while (i <= 122)
		{
			if (b[i] != 0)
			{
				break;
			}
			i++;
		}
		if (i == 123)
		{
			System.out.print("No");
		}

		return 0;
	}

}
