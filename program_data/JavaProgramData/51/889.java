package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String s = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	int i;
	int j;
	int k;
	int[] a = new int[600];
	for (i = 0;i < s.length() - n + 1;i++)
	{
	a[i] = 1;
	for (j = i + 1;j < s.length() - n + 1;j++)
	{
	for (k = 0;k < n;k++)
	{
	if (s.charAt(j + k) != s.charAt(i + k))
	{
	break;
	}
	}
	if (k == n)
	{
	a[i]++;
	}
	}
	}
	int m = 0;
	for (i = 0;i < s.length() - n + 1;i++)
	{
	if (a[i] > m)
	{
	m = a[i];
	}
	}
	if (m < 2)
	{
	System.out.print("NO\n");
	}
	else
	{
	System.out.printf("%d\n",m);
	for (i = 0;i < s.length() - n + 1;i++)
	{
	if (a[i] == m)
	{
	for (j = i;j < i + n;j++)
	{
	System.out.printf("%c",s.charAt(j));
	}
	System.out.print("\n");
	}
	}
	}
	return 0;
	}
}

