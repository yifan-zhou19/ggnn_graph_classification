package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 1;
		int n;
		int[] b = new int[100];
		int m = 0;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		n = a.length() - 1;
		b[0] = n;
		for (i = 0;i <= n;i++)
		{
			if (a.charAt(i) == ' ')
			{
				m = m + 1;
			}
		}
		if (m > 0)
		{
			for (i = n;i >= 0;i--)
			{
			if (a.charAt(i) == ' ')
			{
			b[j] = i;
			j = j + 1;
			}
			}
		for (i = b[1] + 1;i <= b[0];i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print(" ");
		j = 1;
		while (j < m)
		{
			for (i = b[j + 1] + 1;i <= b[j];i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			j = j + 1;
		}
		for (i = 0;i <= b[m] - 1;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		}
		else if (m == 0)
		{
			System.out.println(a);
		}
	}
}
