package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
	int n;
	int i;
	int[] s = new int[53];
	int flag = 0;
	int f = new int(char b,int s[]);
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = 0;i < n;i++)
	{
	if (f(a.charAt(i), s) != 0)
	{
	flag++;
	}
	}
	if (flag == 0)
	{
	System.out.print("No");
	}
	else
	{
	for (i = 0;i < 52;i++)
	{
		if (s[i] == 0)
		{
	continue;
		}
	else
	{
		if (i >= 26 && i <= 52)
		{
	System.out.printf("%c=%d\n",i + 71,s[i]);
		}
	if (i >= 0 && i <= 25)
	{

	System.out.printf("%c=%d\n",i + 65,s[i]);
	}
	}
	}
	}
	return 0;
	}
	public static int f(char b, int[] s)
	{
		int flag = 0;
		if (b >= 65 && b <= 90)
		{
		s[b - 65]++;
	flag = 1;
		}
	if (b >= 97 && b <= 122)
	{
		s[b - 71]++;
	flag = 1;
	}
	return flag;
	}
}
