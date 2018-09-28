package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	int i;
	int j;
	a = new Scanner(System.in).nextLine();
	char[][] b = new char[100][100];
	int count = -1;
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if (a.charAt(i) != ' ')
	{
	count++;
	for (j = 0;a.charAt(i + j) != ' ';j++)
	{
	b[count][j] = a.charAt(i + j);
	}
	i = i + j - 1;
	}
	}
	for (i = count;i >= 0;i--)
	{
	if (i != 0)
	{
	System.out.printf("%s ",b[i]);
	}
	else
	{
	System.out.printf("%s",b[i]);
	}
	}
	}
}
