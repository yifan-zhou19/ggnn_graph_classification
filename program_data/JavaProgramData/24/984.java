package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] dc = new char[50][20];
	String sr = new String(new char[1000]);
	sr = new Scanner(System.in).nextLine();
	int i;
	int j = 0;
	int k = 0;
	int len;
	len = sr.length();
	for (i = 0;i <= len;i++)
	{
	if (sr.charAt(i) != ' ' && sr.charAt(i) != '\0')
	{
	dc[j][k] = sr.charAt(i);
	k++;
	}
	else if (sr.charAt(i) == ' ' || sr.charAt(i) == '\0')
	{
	dc[j][k] = '\0';
	j++;
	k = 0;
	}
	}
	int[] sz = new int[50];
	for (i = 0;i < j;i++)
	{
	sz[i] = String.valueOf(dc[i]).length();
	}
	int min = 0;
	int max = 0;
	for (i = 0;i < j;i++)
	{
	if (sz[i] < sz[min])
	{
		min = i;
	}
	if (sz[i] > sz[max])
	{
		max = i;
	}
	}
	System.out.printf("%s\n",dc[max]);
	System.out.printf("%s\n",dc[min]);
	return 0;
	}
}
