package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		int n = str.length();
		int i;
		int j;
		int[] c = new int[50];
		int d = 0;
		c[0] = n;
		for (i = n - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				d++;
				c[d] = i;
				for (j = i + 1;j < c[d - 1];j++)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
			}
		}
		for (i = 0;i < c[d];i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}
