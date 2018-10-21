package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int f = char k;
	String a = new String(new char[1000]);
	int i;
	int j;
	int t;
	int p;
	int q;
	int r;
	int max;
	int min;
	int n = 0;
	int[] b = new int[51];
	int[] c = new int[51];
	a = new Scanner(System.in).nextLine();
	j = a.length();
	for (i = 0;i <= j;i++)
	{
	if (f(a.charAt(i)) == 1 && f(a.charAt(i + 1)) == 0)
	{
	b[n] = i;
	n++;
	}
	}
	c[1] = b[1] - b[0];
	c[0] = b[0] + 2;
	for (t = 2;t < n;t++)
	{
	c[t] = b[t] - b[t - 1];
	}
	max = min = c[0];
	for (t = 0;t < n;t++)
	{
	if (c[t] > max)
	{
	max = c[t];
	}
	}
	for (p = 0;p < n;p++)
	{
	if (c[p] < min)
	{
	min = c[p];
	}
	}
	for (r = 0;r < n;r++)
	{
	if (c[r] == max)
	{
	t = r;
	break;
	}
	}
	for (q = 0;q < n;q++)
	{
	if (c[q] == min)
	{
	p = q;
	break;
	}
	}
	if (max == c[0])
	{
	for (i = 0;i < b[0] + 1;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	System.out.print("\n");
	}
	if (max != c[0])
	{
	for (i = b[t - 1] + 2;i < b[t] + 1;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	System.out.print("\n");
	}
	if (min == c[0])
	{
	for (i = 0;i < b[0] + 1;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	}
	if (min != c[0])
	{
	for (i = b[p - 1] + 2;i < b[p] + 1;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	}
	}

	public static int f(char k)
	{
	int e;
	if (k >= 'A' && k <= 'Z' || k >= 'a' && k <= 'z')
	{
		e = 1;
	}
	else
	{
		e = 0;
	}
	return (e);
	}



}
