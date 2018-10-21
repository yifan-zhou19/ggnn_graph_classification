package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	void number(char ch[100],int a[256],int b);
	String ch1 = new String(new char[100]);
	String ch2 = new String(new char[100]);
	int m;
	int n;
	int i;
	int t;
	int[] a = new int[256];
	int[] b = new int[256];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ch1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		ch2 = tempVar2.charAt(0);
	}
	m = ch1.length();
	n = ch2.length();
	number(ch1, a, m);
	number(ch2, b, n);
	t = 0;
	for (i = 0;i <= 255;i++)
	{
	if (a[i] != b[i])
	{
		t = t + 1;
	}
	}
	if (t == 0)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}
	}
	public static void number(String ch, int[] a, int b)
	{
	int i;
	for (i = 0;i < b;i++)
	{
	a[ch[i]] = a[ch[i]] + 1;
	}
	}



}

