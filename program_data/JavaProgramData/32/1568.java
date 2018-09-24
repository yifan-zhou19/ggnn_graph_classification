package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int times;
		int i;
		int j;
		int lena;
		int lenb;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String c = new String(new char[2]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			times = Integer.parseInt(tempVar);
		}
		for (j = 0;j < times;j++)
		{
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			c = new Scanner(System.in).nextLine();
			lena = a.length();
			lenb = b.length();
			for (i = 1;i <= lenb;i++)
			{
				a.charAt(lena - i) -= b.charAt(lenb - i) - 48;
			}
			for (i = lena - 1;i > 0;i--)
			{
				if (a.charAt(i) < '0')
				{
					a.charAt(i) += 10;
					a.charAt(i - 1)--;
				}
			}
			System.out.printf("%s\n",a);
		}
	}
}

