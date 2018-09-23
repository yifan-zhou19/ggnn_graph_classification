package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int m;
	int i;
	int j;
	int k;
	int t;
	int max = 0;
	int[] a = new int[1000];
	int[] b = new int[26];
	char[][] s = new char[1000][30];
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		s[i] = tempVar3.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	m = String.valueOf(s[i]).length();
	for (j = 0;j < m;j++)
	{
	t = s[i][j] - 65;
	b[t]++;
	}
	}
	for (i = 0;i < 26;i++)
	{
	if (b[i] >= max)
	{
		max = b[i];
	}
	}
	for (i = 0;i < 26;i++)
	{
	if (b[i] == max)
	{
	k = i;
	c = i + 65;
	System.out.printf("%c\n",c);
	System.out.printf("%d\n",max);
	}
	}
	for (i = 0;i < n;i++)
	{
	m = String.valueOf(s[i]).length();
	for (j = 0;j < m;j++)
	{
	if (s[i][j] == 65 + k)
	{
		System.out.printf("%d\n",a[i]);
	}
	}
	}
	}
}

