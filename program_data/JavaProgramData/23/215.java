package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		char t;
		int n;
		int i;
		int k;
		int m;
		int r = 0;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = n - 1;i >= 0;i--)
	{
	if (a.charAt(i) == ' ')
	{
		r++;
	}
	}
	if (r == 0)
	{
		for (i = 0;i < n;i++)
		{
		System.out.printf("%c",a.charAt(i));
		}
	}
	else
	{
	for (i = n - 1;i >= 0;i--)
	{
		if (a.charAt(i) == ' ')
		{
			k = i;
			break;
		}
	}
	for (i = k + 1;i < n;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	m = k;
		for (i = m - 1;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
			k = i;
			  for (i = k;i < m;i++)
			  {
				   System.out.printf("%c",a.charAt(i));
			  }
			}
		m = k;
		}
		System.out.print(" ");
		for (i = 0;i < m;i++)
		{
		System.out.printf("%c",a.charAt(i));
		}
	}
	}
}
