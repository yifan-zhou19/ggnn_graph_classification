package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num1 = 0;
		int num2 = 0;
		int k1;
		int k2;
		int a;
		int b;
		int tmp = 0;
		int head = 0;
		String m = new String(new char[251]);
		String n = new String(new char[251]);
		String total = new String(new char[255]);
		String x = new String(new char[251]);
		String y = new String(new char[251]);
		m = new Scanner(System.in).nextLine();
		n = new Scanner(System.in).nextLine();
		for (i = 0;m.charAt(i) != '\0' && (m.charAt(i) >= '0' && m.charAt(i) <= '9');i++)
		{
			num1++;
		}
		m = tangible.StringFunctions.changeCharacter(m, i, '\0');
		for (j = 0;n.charAt(j) != '\0' && (n.charAt(j) >= '0' && n.charAt(j) <= '9');j++)
		{
			num2++;
		}
		n = tangible.StringFunctions.changeCharacter(n, j, '\0');
		if (num1 >= num2)
		{
			x = m;
			y = n;
			k1 = num1;
			k2 = num2;
		}
		else
		{
			x = n;
			n = m;
			num1 = x.length();
			num2 = n.length();
			k1 = num1;
			k2 = num2;
		}

		{
			for (j = num1;j > num1 - num2 - 1;j--)
			{
				n = tangible.StringFunctions.changeCharacter(n, j, n.charAt(k2));
				k2--;
			}
			for (j = num1 - num2 - 1;j >= 0;j--)
			{
				n = tangible.StringFunctions.changeCharacter(n, j, '0');
			}
			for (j = num1 - 1;j >= 0;j--)
			{
			   if (x.charAt(j) - '0' + n.charAt(j) - '0' + tmp > 9)
			   {
				  total = tangible.StringFunctions.changeCharacter(total, j, '0' + (x.charAt(j) - '0' + n.charAt(j) - '0' + tmp) % 10);
				  tmp = 1;
			   }
			   else
			   {
				  total = tangible.StringFunctions.changeCharacter(total, j, '0' + (x.charAt(j) - '0' + n.charAt(j) - '0' + tmp) % 10);
				  tmp = 0;
			   }
			}
			total = tangible.StringFunctions.changeCharacter(total, num1, '\0');
			if (tmp == 1)
			{
				System.out.print("1");
				head = 1;
			}
			for (j = 0;j < num1;j++)
			{
				if (total.charAt(j) == '0' && head == 0)
				{
					continue;
				}
				head = 1;
				System.out.printf("%c",total.charAt(j));
			}
			System.out.print("\n");
	}
		return 0;
	}
}

