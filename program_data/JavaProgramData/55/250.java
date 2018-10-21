package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[10]);
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int i;
		int sum = 0;
		int d;
		d = s.length();
		for (i = 0;i < d;i++)
		{
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
			{
				sum = sum * a + (s.charAt(i) - 48);
			}
			if (s.charAt(i) > 64 && s.charAt(i) < 91)
			{
				sum = sum * a + (s.charAt(i) - 55);
			}
			if (s.charAt(i) > 96 && s.charAt(i) < 123)
			{
				sum = sum * a + (s.charAt(i) - 87);
			}
		}
		String ss = new String(new char[20]);
		int c;
		int e = 0;
		for (i = 0;;i++)
		{
			c = sum % b;
			sum = sum / b;
			if (c >= 0 && c < 10)
			{
				ss = tangible.StringFunctions.changeCharacter(ss, i, c + 48);
			}
			if (c > 9 && c < 36)
			{
				ss = tangible.StringFunctions.changeCharacter(ss, i, c + 55);
			}
			e++;
			if (sum == 0)
			{
				break;
			}
		}
		for (i = e;i > 0;i--)
		{
			System.out.printf("%c",ss.charAt(i - 1));
		}
	}
}

