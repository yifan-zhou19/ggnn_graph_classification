package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
	String ch = new String(new char[100]);
	ch = new Scanner(System.in).nextLine();
	for (i = 0;;i++)
	{
		if (ch.charAt(i) == '\0')
		{
			break;
		}
	}
	for (i = i - 1,j = 0;i >= 0;i--)
	{
		if (ch.charAt(i) == ' ')
		{
			for (k = i + 1;k <= i + j;k++)
			{
				System.out.printf("%c",ch.charAt(k));
			}
			System.out.printf("%c",ch.charAt(i));
			j = 0;
		}
	else if (i == 0)
	{
		for (k = i;k <= i + j;k++)
		{
			System.out.printf("%c",ch.charAt(k));
		}
		break;
	}
	else
	{
		j++;
	}
	}
	}
}
