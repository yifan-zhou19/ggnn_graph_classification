package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] show_b = new int[101];
	public static int show(String a, int t)
	{
		int i;
		int k;
		int l;
		int j = 1;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int b[101];
	System.out.println(a);
	for (i = 0;i <= t - 1;i++)
	{
	switch (a[i])
	{
		case '(':
			a[i] = ' ';
			  show_b[j] = i + 1;
			  j++;
			  break;
	case ')':
		a[i] = ' ';
			  show_b[j] = -(i + 1);
			  j++;
			  break;
	default:
		a[i] = ' ';
	}
	}
	j--;
	do
	{
	l = 0;
	for (k = 1;k <= j - 1;k++)
	{
	if (show_b[k] > 0)
	{
		for (i = k + 1;i <= j;i++)
		{
	if (show_b[i] != 0)
	{
	break;
	}
		}
	if (show_b[k] * show_b[i] < 0)
	{
		show_b[k] = 0;
		show_b[i] = 0;
		l++;
	}
	}
	}
	} while (l > 0);
	for (i = 1;i <= j;i++)
	{
		if (show_b[i] < 0)
		{
	a[-show_b[i] - 1] = '?';
		}
	else if (show_b[i] > 0)
	{
	a[show_b[i] - 1] = '$';
	}
	}
	System.out.println(a);
	return 0;
	}
	public static int Main()
	{
		int i;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String a = new String(new char[101]);
		int t;
	a = new Scanner(System.in).nextLine();
	t = a.length();
	show(a, t);
	}
	return 0;
	}
}

