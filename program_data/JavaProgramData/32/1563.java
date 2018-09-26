package <missing>;

public class GlobalMembers
{
	public static void dajianfa(String a, String b)
	{
		int len1;
		int len2;
		int i;

		len1 = a.length();
		len2 = b.length();

		for (i = 1;i <= len2;i = i + 1)
		{
			if (a[len1 - i].compareTo(b[len2 - i]) >= 0)
			{
				a[len1 - i] = a[len1 - i] - b[len2 - i].Substring(48);
			}
			else
			{
				a[len1 - i - 1] -= 1;
				a[len1 - i] = a[len1 - i] - b[len2 - i].Substring(58);
			}
		}

		a[len1] = '\0';
		System.out.println(a);
	}

	public static void Main()
	{
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		char nouse;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			nouse = tempVar2.charAt(0);
		}

		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();

			dajianfa(a, b);
			if (i != n - 1)
			{
				b = new Scanner(System.in).nextLine();
			}
		}
	}
}

