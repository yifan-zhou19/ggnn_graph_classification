package <missing>;

public class GlobalMembers
{
	public static int cvt(String c, int n)
	{
		int i;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum * 10 + c[i] - '0';
		}
		return sum;
	}
	public static void Main()
	{
		final String a = "\0";
		final String c = "\0";
		int i = 0;
		int n;
		int j;
		int k = 0;
		int[] b = new int[300];
		int m1 = 0;
		int m2 = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;a.charAt(i) != ',' && a.charAt(i) != '\0';i++, j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
			}
			b[k++] = cvt(c, j);
		}
		for (i = 0;i < k;i++)
		{
			if (b[i] > m1)
			{
				m1 = b[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			if (b[i] == m1)
			{
				b[i] = 0;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (b[i] > m2)
			{
				m2 = b[i];
			}
		}
		if (m2 == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",m2);
		}
	}

}

