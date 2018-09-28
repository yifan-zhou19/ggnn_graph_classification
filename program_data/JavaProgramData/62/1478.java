package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	void dao(char x[],int y);
	String a = new String(new char[1000]);
	a = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if (a.charAt(i) == ' ')
	{
	if (a.charAt(i + 1) == ' ')
	{
		dao(a, i);

	i--;
	}
	}
	}
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	System.out.printf("%c",a.charAt(i));
	}

	}
	public static void dao(String x, int y)
	{
		 int j;

	for (j = y; !x[j].equals('\0');j++)
	{
	x[j] = x[j + 1];
	}

	}
}
