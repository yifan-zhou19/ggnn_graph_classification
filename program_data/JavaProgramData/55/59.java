package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int temp;
		int i;
		int s = 0;
		int l = 1;
		String n = new String(new char[20000]);
		String m = new String(new char[20000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int len = n.length();
		for (i = len - 1; i >= 0; l *= a,i--)
		{
			if (n.charAt(i) <= '9' && n.charAt(i) >= '0')
			{
				s += (n.charAt(i) - '0') * l;
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				s += (n.charAt(i) - 'a' + 10) * l;
			}
			else
			{
				s += (n.charAt(i) - 'A' + 10) * l;
			}
		}
		for (i = 0;s > 0;i++)
		{
			temp = s % b;
			s = s / b;
			if (temp > 9)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, (char)'A' + temp - 10);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, (char)'0' + temp);
			}
		}
			for (i--;i >= 0;i--)
			{
				System.out.printf("%c",m.charAt(i));
			}
			 System.out.print("\n");
		return 0;
	}
}

