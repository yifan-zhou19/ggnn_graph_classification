package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int l;
		String n = new String(new char[50]);
		String d = new String(new char[50]);
		String m = new String(new char[50]);
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
		if (n.charAt(0) == '0')
		{
		System.out.print("0\n");
		}
		else
		{
		  l = n.length();
		  int x = 0;
		  int j = 0;
		  for (int i = 0;i < l;i++)
		  {
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
			}
			else if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
			}
			x = x * a + n.charAt(i);
		  }
		   for (;x != 0;j++)
		   {
			d = tangible.StringFunctions.changeCharacter(d, j, x % b);
			x = x / b;
		   }
		   d = tangible.StringFunctions.changeCharacter(d, j, '\0');
		  for (int y = 0;y < j;y++)
		  {
			m = tangible.StringFunctions.changeCharacter(m, y, d.charAt(j - y - 1));
		  }
		   m = tangible.StringFunctions.changeCharacter(m, j, '\0');
		  for (int z = 0;z < j;z++)
		  {
			if (m.charAt(z) <= 9)
			{
			m = tangible.StringFunctions.changeCharacter(m, z, m.charAt(z) + '0');
			}
			else
			{
			m = tangible.StringFunctions.changeCharacter(m, z, m.charAt(z) + 'A' - 10);
			}
		  }
			System.out.printf("%s",m);
			System.in.read();
			System.in.read();
		}
	}




}

