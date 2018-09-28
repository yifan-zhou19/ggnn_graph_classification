package <missing>;

public class GlobalMembers
{
	public static int print(String str, int i, int j)
	{
		int t;
		int I = i;
		int J = j;
		while (str[i].equals(str[j]) && j >= i)
		{
			i++;
			j--;
		};
		if (j < i)
		{
			for (t = I;t <= J;t++)
			{
				System.out.printf("%c",str[t]);
			}
			System.out.print("\n");
		}
		return 0;
	}
	public static void Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 1;i < len;i++)
		{
			for (j = i;j < len;j++)
			{
				print(str, j - i, j);
			}
		}
	}
}
