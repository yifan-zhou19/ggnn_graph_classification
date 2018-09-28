package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String shen = new String(new char[1000]);
	char[][] dc = new char[100][100];
	int n = 0;
	int k = 0;
	int len;
	int i;
	int len1;
	shen = new Scanner(System.in).nextLine();
	len = shen.length();
	for (i = 0;i < len;i++)
	{
	if (shen.charAt(i) != ' ')
	{
	dc[n][k] = shen.charAt(i);
	k++;
	}
	else
	{
	dc[n][k] = '\0';
	n++;
	k = 0;
	}
	}
	dc[n][k] = '\0';
	for (i = 0;i < n + 1;i++)
	{
	len1 = String.valueOf(dc[i]).length();
	if (i != n && (len1 > 0))
	{
	System.out.printf("%d,",len1);
	}
	else if ((i == n) && (len1 > 0))
	{
	System.out.printf("%d",len1);
	}
	}
	return 0;
	}

}
