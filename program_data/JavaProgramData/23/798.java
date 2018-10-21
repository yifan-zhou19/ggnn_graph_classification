package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int k;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		while (str.charAt(i) != '\0')
		{
			i++;
		}
		for (i--;i >= 0;i--)
		{
			while (str.charAt(i) != ' ' && i >= 0)
			{
				j++;
				i--;
			}
			for (k = ++i;k < i + j;k++)
			{
				System.out.printf("%c",str.charAt(k));
			}
			if (i != 0)
			{
				System.out.print(" ");
			}
			i--;
			j = 0;
		}
		System.out.print("\n");
	}
}
