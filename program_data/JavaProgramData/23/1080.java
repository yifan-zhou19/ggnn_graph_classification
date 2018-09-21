package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		final String str2 = " ";
		final String str3 = "\0";
		int i;
		int n;
		int p = 1;
		int j;
		int q = 0;
		int m;
		int[] a = new int[100];
		char c;
		str1 = new Scanner(System.in).nextLine();
		str2 += str1;
		n = str2.length();
		for (i = n - 1;i >= 0;i--)
		{
			if ((c = str2.charAt(i)) == ' ')
			{
				a[p] = i;
				p = p + 1;
			}
			else
			{
				continue;
			}
		}
		a[0] = n;
		for (i = 0;i < p - 1;i++)
		{
			for (j = a[i + 1];j < a[i];j++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, q, str2.charAt(j));
				q = q + 1;
			}
		}
		m = str3.length();
		for (i = 1;i < m;i++)
		{
			System.out.printf("%c",str3.charAt(i));
		}
	}

}

