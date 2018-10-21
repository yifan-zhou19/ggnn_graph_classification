package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] s = new char[50][50];
	int[] k = new int[50];
	int a;
	int i;
	int t;
	int j;
	int[] l = new int[50];
	int q = 0;
	while (scanf("%s",s[q]) != EOF)
	{
		q++;
	}
	for (i = 0;i <= q;i++)
	{
	k[i] = String.valueOf(s[i]).length();
	l[i] = k[i];
	}
	for (i = 0;i <= q;i++)
	{
	for (j = i + 1;j <= q;j++)
	{
	if (l[i] < l[j])
	{
	t = l[i];
	l[i] = l[j];
	l[j] = t;
	}
	}
	}
	if (l[q] == 0)
	{
		l[q] = l[q - 1];
	}
	for (i = 0;i <= q;i++)
	{
	if (k[i] == l[0])
	{
		System.out.printf("%s\n",s[i]);
		break;
	}
	}
	for (i = 0;i <= q;i++)
	{
	if (k[i] == l[q])
	{
		System.out.printf("%s",s[i]);
		break;
	}
	}
	}

}
