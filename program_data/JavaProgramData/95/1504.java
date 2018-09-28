package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int n;
		int len = a.length();
		for (i = 0;i < len;i++)
		{
			if ('a' <= a.charAt(i) && a.charAt(i) <= 'z')
			{
				j = a.charAt(i) - 'a';
			}
			else if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z')
			{
				j = a.charAt(i) - 'A';
			}
			else
			{
				j = 0;
			}
			if ('a' <= b.charAt(i) && b.charAt(i) <= 'z')
			{
				k = b.charAt(i) - 'a';
			}
			else if ('A' <= b.charAt(i) && b.charAt(i) <= 'Z')
			{
				k = b.charAt(i) - 'A';
			}
			else
			{
				k = 0;
			}
			if (j > k)
			{
				System.out.print(">");
				n = 0;
				break;
			}
			else if (j < k)
			{
				System.out.print("<");
				n = 0;
				break;
			}
			else
			{
				n++;
			}
		}
		if (n != 0)
		{
			System.out.print("=");
		}
		return 0;
	}

}
