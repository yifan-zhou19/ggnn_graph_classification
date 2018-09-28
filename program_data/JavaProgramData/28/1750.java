package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	char[][] a = new char[100][100];
	int i;
	int j = 0;
	int n = 0;
	int len;
	s = new Scanner(System.in).nextLine();
	len = s.length();
	for (i = 0;i < len;i++)
	{
	if (s.charAt(i) != ' ')
	{
	a[n][j] = s.charAt(i);
	j++;
	}
	else
	{
	a[n][j] = '\0';
	n++;
	j = 0;
	}
	}
	a[n][j] = '\0';
	for (i = 0;i < n;i++)
	{
	if (String.valueOf(a[i]).length() != 0)
	{
	System.out.printf("%d,",String.valueOf(a[i]).length());
	}
	}
	System.out.printf("%d",String.valueOf(a[n]).length());
	return 0;
	}

}
