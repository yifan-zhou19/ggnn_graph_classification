package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] a = new int[500];
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		if (str.length() == 2 && (str.charAt(0) - 48) * 10 + (str.charAt(1) - 48) < 13 || str.length() == 1)
		{
			System.out.printf("0\n%s",str);
		}
		else
		{
		m = str.charAt(0) - 48;
		for (i = 1;i < str.length();i++)
		{
			a[i] = (str.charAt(i) - 48 + 10 * m) / 13;
			m = (str.charAt(i) - 48 + 10 * m) % 13;


		}
		i = 1;
		while (a[i] == 0)
		{
			i++;
		}
		for (;i < str.length();i++)
		{
			System.out.printf("%d",a[i]);

		}


		System.out.print("\n");
		System.out.printf("%d",m);
		}


		return 0;
	}

}
