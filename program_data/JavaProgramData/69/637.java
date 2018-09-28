package <missing>;

public class GlobalMembers
{
	public static void add(int[] a1, int[] a2, int[] b, int[] a3, int i)
	{
		if (i == 0)
		{
			a3[i] = a1[i] + a2[i];
			if (a3[i] >= 10)
			{
				b[i] = 1;
				a3[i] -= 10;
			}
		}
		else
		{
			a3[i] = a1[i] + a2[i] + b[i - 1];
			if (a3[i] >= 10)
			{
				b[i] = 1;
				a3[i] -= 10;
			}
		}
	}

	public static void Main()
	{
		String s1 = new String(new char[MAX]);
		String s2 = new String(new char[MAX]);
		int[] a1 = new int[MAX - 1];
		int[] a2 = new int[MAX - 1];
		int[] b = new int[MAX - 1];
		int[] a3 = new int[MAX - 1];
		int len1;
		int len2;
		int i;
		int j;

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len1 = s1.length();
		for (i = 0;i < len1;i++)
		{
			a1[i] = s1.charAt(len1 - 1 - i) - 48;
		}
		len2 = s2.length();
		for (i = 0;i < len2;i++)
		{
			a2[i] = s2.charAt(len2 - 1 - i) - 48;
		}

		len1 = (len1 > len2)?len1:len2;
		for (i = 0;i <= len1;i++)
		{
			add(a1, a2, b, a3, i);
		}

		for (i = MAX - 2;i >= 0;i--)
		{
			if (a3[i] != 0)
			{
				break;
			}
		}

		if (i == -1)
		{
			System.out.print('0');
		}
		else
		{
			for (j = i;j >= 0;j--)
			{
				System.out.printf("%d",a3[j]);
			}
		}
		System.out.print("\n");
	}
}
