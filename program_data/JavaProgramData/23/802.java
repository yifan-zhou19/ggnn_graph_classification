package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char c;
		int i;
		int n;
		int a;
		int b;
		int j;
		int k;
		int line;
		str = new Scanner(System.in).nextLine();
		n = str.length();
			b = n - 1;
		for (i = n - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				a = i;
			for (j = a + 1;j <= b;j++)
			{
				System.out.printf("%c",str.charAt(j));
				if (j == b)
				{
					System.out.print(" ");
				}
			}
				  b = a - 1;
			}
			 if (i == 0)
			 {
				for (k = 0;k <= b;k++)
				{
				System.out.printf("%c",str.charAt(k));
				}
			 }
		}
	}
}
