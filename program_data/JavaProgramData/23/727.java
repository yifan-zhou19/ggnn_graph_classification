package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int k;
		char[][] a = new char[100][100];
		String b = new String(new char[101]);
		b = new Scanner(System.in).nextLine();
		for (;b.charAt(j) != 0;)
		{
			if (b.charAt(j) != ' ')
			{
				for (k = 0;b.charAt(j) != ' ' && b.charAt(j) != 0;j++, k++)
				{
					a[i][k] = b.charAt(j);
				}
				a[i][k] = 0;
				i++;
			}
			else
			{
				j++;
			}
		}
		System.out.printf("%s",a[i - 1]);
		for (j = i - 2;j >= 0;j--)
		{
			System.out.printf(" %s",a[j]);
		}
	}
}
