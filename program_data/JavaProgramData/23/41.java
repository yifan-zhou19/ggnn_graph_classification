package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int m;
		int k = 1;
		int i = 0;
		int q;
		int[] a = new int[1000];
		String p = new String(new char[1000]);
		p = new Scanner(System.in).nextLine();
		l = p.length();
		for (m = 0;m < l;m++)
		{
			if (p.charAt(m) == ' ')
			{
				a[k] = m + 1;
				k++;
			}
		}
		a[0] = 0;
		a[k] = l + 1;
		for (i = k - 1;i >= 1;i--)
		{
			for (q = a[i];q < a[i + 1] - 1;q++)
			{
				System.out.printf("%c",p.charAt(q));
			}
			System.out.print(" ");
		}
		{
			for (q = a[0];q < a[1] - 1;q++)
			{
				System.out.printf("%c",p.charAt(q));
			}
	}
	}

}
