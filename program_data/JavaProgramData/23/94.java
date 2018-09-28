package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		final String word = "";
		int i;
		int j;
		int k = 0;
		int[] a = new int[100];
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) != 32)
			{
				word.charAt(k)[a[k]] = str.charAt(i);
				a[k]++;
			}
			else
			{
				k++;
			}
		}
		for (i = k;i > 0;i--)
		{
			System.out.printf("%s ",word.charAt(i));
		}
		System.out.printf("%s",word.charAt(0));
	}

}
