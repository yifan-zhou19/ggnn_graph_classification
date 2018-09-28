package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int sum = 0;
		int i;
		int l;
		int[] p = new int[100];
		String s = new String(new char[100]);
		String q = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'a')
			{
				sum = sum * a + (s.charAt(i) - 87);
			}
			else
			{
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					sum = sum * a + (s.charAt(i) - 55);
				}
				else
				{
					sum = sum * a + (s.charAt(i) - 48);
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = 0;sum != 0;i++)
			{
				p[i] = sum % b;
				if (p[i] < 10)
				{
					q = tangible.StringFunctions.changeCharacter(q, i, p[i] + 48);
				}
				else
				{
					q = tangible.StringFunctions.changeCharacter(q, i, p[i] + 55);
				}
				sum = sum / b;
			}
			for (i--;i >= 0;i--)
			{
				System.out.print(q.charAt(i));
			}
		}
		return 0;
	}
}

