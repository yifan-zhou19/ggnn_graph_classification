package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		s = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int index = 0;
		int k = 0;
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
				a[j][k] = s.charAt(i);
				k++;
			}
			else
			{
				a[j][k] = '\0';
				j++;
				k = 0;
			}

		}
		for (i = j;i > 0;i--)
		{
			System.out.printf("%s ",a[i]);
		}
		System.out.printf("%s\n",a[0]);
	}


}
