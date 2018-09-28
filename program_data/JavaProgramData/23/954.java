package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		int n;
		int i;
		int j;
		int a1;
		int a2;
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		a1 = n - 1;
		for (i = a1;i >= 0;i--)
		{
			if (str1.charAt(i) == ' ')
			{
			a2 = i + 1;
			for (j = a2;j <= a1;j++)
			{
			System.out.printf("%c",str1.charAt(j));
			}
			System.out.print(" ");
			a1 = i - 1;
			}
		}
		for (i = 0;i <= a1;i++)
		{
		System.out.printf("%c",str1.charAt(i));
		}
	}
}
