package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int sum;
		int i;
		int k;
		int l;
		String n = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = n.length();
		if (n.charAt(0) == '0')
		{
		   System.out.print("0\n");
		}
		else
		{
			for (i = 0,sum = 0;i < l;i++)
			{
				if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				{
				   c = n.charAt(i) - 'a' + 10;
				}
				if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
				{
				   c = n.charAt(i) - 'A' + 10;
				}
				if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
				{
				   c = n.charAt(i) - '0';
				}
				sum = c + sum * a;
			}
			String d = new String(new char[40]);
			for (k = 0;sum != 0;k++)
			{
				d = tangible.StringFunctions.changeCharacter(d, k, sum % b);
				sum = sum / b;
			}
			d = tangible.StringFunctions.changeCharacter(d, k, '\0');
			String e = new String(new char[40]);
			for (i = 0;i < k;i++)
			{
				if (d.charAt(i) < 10)
				{
				   e = tangible.StringFunctions.changeCharacter(e, k - 1 - i, d.charAt(i) + '0');
				}
				else
				{
				   e = tangible.StringFunctions.changeCharacter(e, k - 1 - i, d.charAt(i) - 10 + 'A');
				}
			}
			e = tangible.StringFunctions.changeCharacter(e, k, '\0');
			System.out.printf("%s",e);
		}
		System.in.read();
		System.in.read();
	}


}

