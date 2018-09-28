package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int len;
	int k;
	String x = new String(new char[100]);
	String a = new String(new char[81]);
	x = new Scanner(System.in).nextLine();
	n = Integer.parseInt(x);
	for (i = 0;i < n;i++)
	{
		a = new Scanner(System.in).nextLine();
		if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
		{
		len = a.length();
		for (k = 1;k < len;k++)
		{
			if (a.charAt(k) == '_' || (a.charAt(k) >= 'a' && a.charAt(k) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z') || (a.charAt(k) >= '0' && a.charAt(k) <= '9'))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		}
		else
		{
			k = 0;
		}
		if (k == len)
		{
			System.out.print("1\n");
		}
		else
		{
			System.out.print("0\n");
		}
	}
	return 0;
	}


}
