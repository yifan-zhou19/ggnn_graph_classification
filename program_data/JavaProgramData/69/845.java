package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[250]);
		String n = new String(new char[250]);
		String x = new String(new char[250]);
		String total = new String(new char[255]);
		int sl1 = 0;
		int sl2 = 0;
		int i;
		int j;
		int a;
		int tmp = 0;
		int head = 0;
		m = new Scanner(System.in).nextLine();
		n = new Scanner(System.in).nextLine();
		x = m;
		for (i = 0;m.charAt(i) != 0 && (m.charAt(i) >= '0' && m.charAt(i) <= '9');i++)
		{
			sl1++;
		}
		for (i = 0;n.charAt(i) != 0 && (n.charAt(i) >= '0' && n.charAt(i) <= '9');i++)
		{
			sl2++;
		}
		if (sl1 < sl2)
		{
			m = n;
			n = x;
			a = sl1;
			sl1 = sl2;
			sl2 = a;
		}
		for (j = 0;j <= sl2;j++)
		{
			n = tangible.StringFunctions.changeCharacter(n, sl1 - j, n.charAt(sl2 - j));
		}
		for (j = sl2 + 1;j <= sl1;j++)
		{
			n = tangible.StringFunctions.changeCharacter(n, sl1 - j, '0');
		}
		for (i = sl1 - 1;i >= 0;i--)
		{
			if (m.charAt(i) - '0' + n.charAt(i) - '0' + tmp > 9)
			{
				total = tangible.StringFunctions.changeCharacter(total, i, '0' + (m.charAt(i) - '0' + n.charAt(i) - '0' + tmp) % 10);
				tmp = 1;
			}
			else
			{
				total = tangible.StringFunctions.changeCharacter(total, i, m.charAt(i) + n.charAt(i) + tmp - '0');
				tmp = 0;
			}
		}
		if (tmp == 1)
		{
			System.out.print("1");
			head = 1;
		}
		for (j = 0;j < sl1;j++)
		{
			if (total.charAt(j) == '0' && head == 0 && j != sl1 - 1)
			{
				head = 0;
				continue;
			}
			head = 1;
			System.out.printf("%c",total.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

