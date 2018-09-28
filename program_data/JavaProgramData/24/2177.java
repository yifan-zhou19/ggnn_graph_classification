package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[200][30];
		String c = new String(new char[500]);
		String temp = new String(new char[30]);
		int i;
		int j;
		int k;
		int p;
		int m;
		int l;
		int d;
		c = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (c.charAt(i) == ' ' || c.charAt(i) == ',' || c.charAt(i) == '\0')
			{
				k = i;
				a[0] = c.substring(0, k);
				a[0][k] = '\0';
				break;
			}
		}
		if (c.charAt(i) == '\0')
		{
			System.out.printf("%s\n",a[0]);
			System.out.printf("%s\n",a[0]);
		}
		else
		{
			for (m = 1,i = k;;i++)
			{
			if (c.charAt(i) == ' ' || c.charAt(i) == ',')
			{
				for (j = i + 2;;j++)
				{
					if (c.charAt(j) == ' ' || c.charAt(j) == ',' || c.charAt(j) == '\0')
					{
						for (p = 0;p < j - i - 1;p++)
						{
						   a[m][p] = c.charAt(i + 1 + p);
						}
					a[m][j - i - 1] = '\0';
						 m++;
						 break;
					}
				}
				if (c.charAt(j) == '\0')
				{
					break;
				}
			}
			}
		temp = a[0];
		for (i = 1;i < m;i++)
		{
			l = temp.length();
			d = String.valueOf(a[i]).length();
			if (d > l)
			{
				temp = a[i];
			}
		}
		System.out.printf("%s\n",temp);

		temp = a[0];
		for (i = 1;i < m;i++)
		{
			l = temp.length();
			d = String.valueOf(a[i]).length();
			if (d < l)
			{
				temp = a[i];
			}
		}
		System.out.printf("%s\n",temp);
		}

	}
}
