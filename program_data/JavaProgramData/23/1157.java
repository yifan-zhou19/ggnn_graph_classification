package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String str = new String(new char[100]);
	int i;
	int j;
	int a;
	str = new Scanner(System.in).nextLine();
	a = str.length();
	for (i = str.length() - 1;i >= 0;i--)
	{
		if (str.charAt(i) == ' ')
		{
			for (j = i + 1;j < a;j++)
			{
		 System.out.printf("%c",str.charAt(j));
			}
		 System.out.print(" ");
		 a = i;
		}
	}
	for (i = 0;i < str.length();i++)
	{
	if (str.charAt(i) == ' ')
	{
		break;
	}
	}
	for (j = 0;j < i;j++)
	{
	System.out.printf("%c",str.charAt(j));
	}
	}
}
