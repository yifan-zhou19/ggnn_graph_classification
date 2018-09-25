package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[300]);
		s = new Scanner(System.in).nextLine();
		int i;
		int count = 0;
	for (i = 0;s.charAt(i) != '\0';i++)
	{
		a = a.substring(0, i);
	}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == 97)
			{
				a.charAt(1)++;
				count++;
			}
	if (s.charAt(i) == 98)
	{
		a.charAt(2)++;
		count++;
	}
	if (s.charAt(i) == 99)
	{
		a.charAt(3)++;
		count++;
	}
	if (s.charAt(i) == 100)
	{
		a.charAt(4)++;
		count++;
	}
	if (s.charAt(i) == 101)
	{
		a.charAt(5)++;
		count++;
	}
	if (s.charAt(i) == 102)
	{
		a.charAt(6)++;
		count++;
	}
	if (s.charAt(i) == 103)
	{
		a.charAt(7)++;
		count++;
	}
	if (s.charAt(i) == 104)
	{
		a.charAt(8)++;
		count++;
	}
	if (s.charAt(i) == 105)
	{
		a.charAt(9)++;
		count++;
	}
	if (s.charAt(i) == 106)
	{
		a.charAt(10)++;
		count++;
	}
	if (s.charAt(i) == 107)
	{
		a.charAt(11)++;
		count++;
	}
	if (s.charAt(i) == 108)
	{
		a.charAt(12)++;
		count++;
	}
	if (s.charAt(i) == 109)
	{
		a.charAt(13)++;
		count++;
	}
	if (s.charAt(i) == 110)
	{
		a.charAt(14)++;
		count++;
	}
	if (s.charAt(i) == 111)
	{
		a.charAt(15)++;
		count++;
	}
	if (s.charAt(i) == 112)
	{
		a.charAt(16)++;
		count++;
	}
	if (s.charAt(i) == 113)
	{
		a.charAt(17)++;
		count++;
	}
	if (s.charAt(i) == 114)
	{
		a.charAt(18)++;
		count++;
	}
	if (s.charAt(i) == 115)
	{
		a.charAt(19)++;
		count++;
	}
	if (s.charAt(i) == 116)
	{
		a.charAt(20)++;
		count++;
	}
	if (s.charAt(i) == 117)
	{
		a.charAt(21)++;
		count++;
	}
	if (s.charAt(i) == 118)
	{
		a.charAt(22)++;
		count++;
	}
	if (s.charAt(i) == 119)
	{
		a.charAt(23)++;
		count++;
	}
	if (s.charAt(i) == 120)
	{
		a.charAt(24)++;
		count++;
	}
	if (s.charAt(i) == 121)
	{
		a.charAt(25)++;
		count++;
	}
	if (s.charAt(i) == 122)
	{
		a.charAt(26)++;
		count++;
	}
		}
		if (count == 0)
		{
			System.out.print("No");
		}
		for (i = 1;i <= 26;i++)
		{
			if (a.charAt(i) != 0)
			{
				System.out.printf("%c=%d\n",i + 96,a.charAt(i));
			}
		}
	}
}
