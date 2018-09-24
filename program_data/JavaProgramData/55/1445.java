package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int s = 0;
		int i;
		int j = 0;
		int t;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) <= '9')
			{
				s = s * a + c.charAt(i) - '0';
			}
			else if (c.charAt(i) >= 'a')
			{
				s = s * a + c.charAt(i) - 'a' + 10;
			}
			else
			{
				s = s * a + c.charAt(i) - 'A' + 10;
			}
		}
		if (s > 0)
		{
		while (s > 0)
		{
			t = s % b;
			if (t <= 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, t + 48);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, j, t + 55);
			}
			j++;
			s = s / b;
		}
		for (i = j - 1;i >= 0;i--)
		{
			System.out.printf("%c",d.charAt(i));
		}
		}
		else
		{
			System.out.print("0");
		}
	}







}

