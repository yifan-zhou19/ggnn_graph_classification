package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[9000]);
		final String a = "";
		str = new Scanner(System.in).nextLine();
		int len;
		int i;
		int k;
		int j;
		len = str.length();
		k = 0;
		for (i = 0;i < len;i++)
		{
			j = 0;
			while (str.charAt(i) != ' ' && i < len)
			{
				a.charAt(k)[j] = str.charAt(i);
				i++;
				j++;
			}
			k++;
		}

		for (i = k - 1;i > 0;i--)
		{
			System.out.printf("%s ",a.charAt(i));
		}
		System.out.printf("%s",a.charAt(0));
	}
}
