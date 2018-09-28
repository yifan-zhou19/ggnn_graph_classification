package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int c;
		int j;
		a = new Scanner(System.in).nextLine();
		if (a.length() == 1)
		{
			b[0] = 0;
			c = a.charAt(0) - '0';
			System.out.printf("%d\n%d",b[0],c);
		}
		else if (a.length() == 2 && ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') < 13)
		{
			b[0] = 0;
			c = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
			System.out.printf("%d\n%d",b[0],c);
		}
		else
		{
			c = ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') % 13;
			b[0] = (int)(((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') / 13);
			for (int i = 2;i < a.length();i++)
			{
				b[i - 1] = (int)((c * 10 + a.charAt(i) - '0') / 13);
				c = (c * 10 + a.charAt(i) - '0') % 13;
			}
			if (b[0] == 0)
			{
				j = 1;
			}
			else
			{
				j = 0;
			}
			for (;j < a.length() - 1;j++)
			{
				System.out.printf("%d",b[j]);
			}
			System.out.printf("\n%d",c);
		}
		return 0;
	}
}
