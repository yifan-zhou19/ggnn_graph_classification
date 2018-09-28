package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30000]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int lenth;
		int y = 1;
		int j;
		int i;
		int m;
		int num;
		int tag = 0;
		lenth = a.length();
		b = new Scanner(System.in).nextLine();
		m = b.length();
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < lenth;i += y)
		{
			y = 1;
			num = 0;
			if (tag == 0)
			{
			for (j = 0;j < m;j++)
			{
				if (a.charAt(i + j) == b.charAt(0 + j))
				{
					num++;
				}
			}
			if (num == m)
			{
				System.out.printf("%s",c);
				y = m;
				tag = 1;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}


}
