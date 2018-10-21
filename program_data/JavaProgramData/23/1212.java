package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int l;
		int i;
		int j;
		int m;
		l = str.length();
		int[] a = new int[50];
		j = 0;
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) == ' ')
			{
				a[j] = i;
				j = j + 1;
			}
		}
		if (j != 0)
		{
			for (i = (a[j - 1] + 1);i < l;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print(" ");
			for (m = 2;m <= j;m++)
			{
				for (i = (a[j - m] + 1);i <= (a[j - m + 1] - 1);i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print(" ");
			}
			for (i = 0;i < a[0];i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",str);
		}
	return 0;
	}
}
