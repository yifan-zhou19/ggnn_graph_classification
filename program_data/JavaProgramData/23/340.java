package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[101];
		int m = 0;
		int l = 0;
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
				{
					a[m] = i + 1;
					m++;
				}

			}
			for (i = m - 1;i >= 0;i--)
			{
				for (j = a[i];str.charAt(j) != '\0' && str.charAt(j) != ' ';j++)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(' ');
			}
			if (str.charAt(0) != ' ')
			{
			for (i = 0;str.charAt(i) != '\0' && str.charAt(i) != ' ';i++)
			{
				System.out.print(str.charAt(i));
			}
			}
			return 0;
	}
}
