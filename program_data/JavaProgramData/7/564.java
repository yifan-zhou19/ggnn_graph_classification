package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	String a = new String(new char[50]);
	String b = new String(new char[50]);

	int i;
	int lenb;
	int n;
	int j;
	int flag;
	int k = 10001;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	lenb = (int)b.length();

	for (i = 0; i <= (int)s.length(); i++,flag = 0)
	{
		for (n = 0,j = i;a.charAt(n) != '\0';n++,j++)
		{
			if (s.charAt(j) != a.charAt(n))
			{
			flag = 1;
			break;
			}
		}
		if (flag != 0)
		{
			continue;
		}
		else
		{
			k = i;
			break;
		}
	}
	for (i = 0;i < s.length();i++)
	{
		if (i == k)
		{
			System.out.printf("%s",b);
			i = i + lenb - 1;
			continue;
		}
		else
		{
			System.out.printf("%c",s.charAt(i));
		}

	}
	return 0;
	}
}
