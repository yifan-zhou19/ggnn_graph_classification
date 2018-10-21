package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		int[] str2 = new int[100];
		int n;
		int i;
		int j = 0;
		int k;
		int m;
		int x;
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		for (i = 0;i <= n;i++)
		{
			if (str1.charAt(i) == ' ')
			{
				str2[j] = i;
				j++;
			}
		}
		if (j != 0)
		{
		for (m = (str2[j - 1] + 1);m < n;m++)
		{
			System.out.printf("%c",str1.charAt(m));
		}
		for (x = 1;x <= j - 1;x++)
		{
			for (m = str2[j - (x + 1)];m <= (str2[j - x] - 1);m++)
			{
				System.out.printf("%c",str1.charAt(m));
			}

		}
		System.out.print(" ");
		for (m = 0;m <= (str2[0] - 1);m++)
		{
			System.out.printf("%c",str1.charAt(m));
		}
		}
		else
		{
			System.out.println(str1);
		}

	}
}
