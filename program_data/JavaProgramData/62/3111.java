package <missing>;

public class GlobalMembers
{
	public static void del(String a, int k, int n)
	{
		int i;
		for (i = k;i <= n;i++)
		{
			a[i] = a[i + 1];
		}
	}

	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		i = 1;
		while (i <= n)
		{
			if ((a.charAt(i - 1) == ' ') && (a.charAt(i) == ' '))
			{
				del(a, i, n);
				n--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(a);
		return 0;
	}


}
