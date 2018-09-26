package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int flag;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length();
		flag = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != b.charAt(i))
			{
				if (a.charAt(i) >= 'a')
				{
					a.charAt(i) -= 'a'-'A';
				}
				if (b.charAt(i) >= 'a')
				{
					b.charAt(i) -= 'a'-'A';
				}
				if (a.charAt(i) != b.charAt(i))
				{
					flag = (a.charAt(i) > b.charAt(i))?1:-1;
					break;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("=");
		}
		else if (flag == 1)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
	}

}
