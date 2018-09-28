package <missing>;

public class GlobalMembers
{
	public static int rev(int m)
	{
	String s = new String(new char[1050]);
	int k = m;
	int ans = 0;
	int i = 0;
	while (k > 0)
	{
	s = tangible.StringFunctions.changeCharacter(s, i, k % 10);
	k /= 10;
	i++;
	}
	i--;
	int base = 1;
	while (s.charAt(i) == 0)
	{
		i--;
	}
	for (;i >= 0;i--)
	{
	ans += s.charAt(i) * base;
	base *= 10;
	}
	return ans;
	}
	public static int Main()
	{
	for (int kk = 1;kk <= 6;kk++)
	{
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 0)
	{
		m = 0 - n;
	}
	else
	{
		m = n;
	}
	if (m == 0)
	{
		System.out.print("0\n");
	}
	else
	{
	m = rev(m);
	if (n < 0)
	{
	System.out.print("-");
	}
	System.out.printf("%d\n",m);
	}
	}
	}

}

