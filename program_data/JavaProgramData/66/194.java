package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int x;
		int t = 0;
		int i = 0;
		int j;
		int o;
		String f = new String(new char[100]);
		String g = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		o = f.length();
		if (o > 6)
		{
		for (j = o - 5;j < o;j++)
		{

			g = tangible.StringFunctions.changeCharacter(g, i, f.charAt(j));
			i++;
		}
		a = Integer.parseInt(g);

		}
		else
		{
			a = Integer.parseInt(f);
		}
		a = a % 400;
		x = a / 100;
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				t = t + 31;
			}
			else if (i == 2)
			{
				t = t + 28;
			}
			else
			{
				t = t + 30;
			}
		}
		n = (a - 1) * 365 + (a / 4 - x) + t + c - 1;
		n = n % 7;
		if (b < 3)
		{
			n = n - 1;
		}
		if (n < 0)
		{
			n = n + 7;
		}
		switch (n)
		{
		case 0 :
			System.out.print("Mon.\n");
			break;
		case 1 :
			System.out.print("Tue.\n");
			break;
		case 2 :
			System.out.print("Wed.\n");
			break;
		case 3 :
			System.out.print("Thu.\n");
			break;
		case 4 :
			System.out.print("Fri.\n");
			break;
		case 5 :
			System.out.print("Sat.\n");
			break;
		case 6 :
			System.out.print("Sun.\n");
			break;
		}
		return 0;

	}
}

