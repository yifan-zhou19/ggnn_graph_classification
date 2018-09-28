package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int p;
		int k = 0;
		int m;
		int b;
		String c = new String(new char[1200]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
		}
		c = tangible.StringFunctions.changeCharacter(c, i + 1, ',');

		for (i = 0;c.charAt(i) != 0;i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
			a[k] = a[k] * 10 + c.charAt(i) - '0';
			}

			if (c.charAt(i) == ',')
			{
			k++;
			}
		}
		p = k;




		m = a[0];
		for (k = 0;k <= p;k++)
		{
				if (a[k] > m)
				{
					m = a[k];
				}
		}
		for (k = 0;k <= p;k++)
		{
			if (a[k] == m)
			{
				a[k] = 0;
			}
		}





		b = a[0];
		for (k = 0;k <= p;k++)
		{
			if (a[k] > b)
			{
				b = a[k];
			}
		}
		if (b < m && b>0)
		{
			System.out.printf("%d",b);
		}
		if (b == m || b == 0)
		{
			System.out.print("No");
		}



	}








}

