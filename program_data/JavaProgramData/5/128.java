package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s = 0;
		int cmp = new int(char s1,char s2);
		int ex = char s;
		float input = 0F;
		float sum = 0F;
		float cor = 0F;
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}

		sum = s1.length();

		for (i = 0;s1.charAt(i) != 0;i++)
		{
			s += ex(s1.charAt(i));
			s += ex(s2.charAt(i));
			cor += cmp(s1.charAt(i), s2.charAt(i));
		}
		if (s != 0)
		{
			System.out.print("error\n");
			return 0;
		}
		else
		{
			if ((cor / sum) >= input)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			return 0;
		}
	}
	public static int ex(char s)
	{
		switch (s)
		{
		case 'A':
			;
		case 'T':
			;
		case 'C':
			;
		case 'G':
			return 0;
			break;
		default :
			return 1;
			break;
		}
	}
	public static int cmp(char s1,char s2)
	{
		if (s1 == s2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

