package <missing>;

public class GlobalMembers
{
	public static int getstr(String str, String s, int m, int n)
	{
	int i;
	int j = 0;
	for (i = m + 1;i < n;i++,j++)
	{
	s[j] = str[i];
	}
	for (i = j;i < s.length();i++)
	{
	s[i] = null;
	}
	return 0;
	}
	public static int Main()
	{
	String snt = new String(new char[300]);
	char[][] word = new char[49][20];
	String p;
	String q;
	int len;
	int[] label = new int[50];
	int i;
	int j = 0;
	int k;
	int l = 0;
	snt = new Scanner(System.in).nextLine();
	len = snt.length();
	for (i = 0;i < len;i++)
	{
	if (snt.charAt(i) == ' ')
	{
	label[j++] = i;
	}
	}
	for (i = 1;i < j;i++)
	{
	getstr(snt, word[i], label[i - 1], label[i]);
	}
	for (k = 0;k < label[0];k++)
	{
	*(word[0] + k) = *(snt.Substring(k));
	}
	*(word[0] + k) = '\0';
	for (k = label[j - 1] + 1;k < len;k++,l++)
	{
	*(word[j] + l) = *(snt.Substring(k));
	}
	*(word[j] + l) = '\0';
	p = word[0];
	for (k = 0;k < j;k++)
	{
	if (String.valueOf(word[k + 1]).length() > p.length())
	{
	p = word[k + 1];
	}
	}
	System.out.printf("%s\n",p);
	q = word[0];
	for (k = 0;k < j;k++)
	{
	if (String.valueOf(word[k + 1]).length() < q.length())
	{
	q = word[k + 1];
	}
	}
	System.out.printf("%s\n",q);
	return 0;
	}
}
