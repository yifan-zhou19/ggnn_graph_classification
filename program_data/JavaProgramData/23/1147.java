package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		int i;
		int l = 0;
		int j;
		int strl;
		int k;
		int m;
		int n;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				l = l + 1;
				b[l] = i;
			}
		}
		strl = a.length();
		if (l == 0)
		{
			System.out.println(a);
		}
		 /* ????????�i==strl�??�l==0� */
		else
		{
		for (m = b[l] + 1;m < strl;m++)
		{
			System.out.printf("%c",a.charAt(m));
		}
		for (j = l;j > 1;j--)
		{
			for (k = b[j - 1];k < b[j];k++)
			{
				System.out.printf("%c",a.charAt(k));
			}
		}
		System.out.print(" ");
		for (n = 0;n < b[1];n++)
		{
			System.out.printf("%c",a.charAt(n));
		}
		}
		return 0;
	}

}
