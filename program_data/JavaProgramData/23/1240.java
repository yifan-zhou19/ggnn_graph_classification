package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int i;
		int n;
		int m = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		b[0] = 0;
		for (i = 0;i <= n;i++)
		{
			if (a.charAt(i) == ' ')
			{
				m++;
				b[m] = i;
			}
		}
	if (m == 0)
	{
		System.out.println(a);
	}
	else
	{
		for (i = b[m] + 1;i <= n - 1;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print(" ");
		for (i = m - 1;i >= 1;i--)
		{
			for (j = b[i] + 1;j <= b[i + 1];j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
		}
		for (i = 0;i <= b[1] - 1;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
	}
	}

}
