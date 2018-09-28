package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int k;
		int s;
		int j;
		int[] d = new int[40];
		String n = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar2 != null)
		{
			n = tangible.StringFunctions.changeCharacter(n, 0, tempVar2);
		}
		i = 0;
		while (n.charAt(i) != ' ')
		{
			  i = i + 1;
			  String tempVar3 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar3 != null)
			  {
				  n = tangible.StringFunctions.changeCharacter(n, i, tempVar3);
			  }
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b = Integer.parseInt(tempVar4);
		}
		k = 1;
		s = 0;
		for (j = i - 1;j >= 0;j--)
		{
			if (n.charAt(j) >= '0' && n.charAt(j) <= '9')
			{
			s = s + k * (n.charAt(j) - '0');
			}
			else if (n.charAt(j) >= 'a' && n.charAt(j) <= 'z')
			{
			s = s + k * (n.charAt(j) - 'a' + 10);
			}
			else
			{
				s = s + k * (n.charAt(j) - 'A' + 10);
			}
			k = k * a;
		}
		i = 0;
		while (s >= b)
		{
			  d[i] = s % b;
			  i = i + 1;
			  s = s / b;
		}
		d[i] = s;
		for (j = i;j >= 0;j--)
		{
			if (d[j] <= 9)
			{
			n = tangible.StringFunctions.changeCharacter(n, i - j, d[j] + '0');
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, i - j, d[j] - 10 + 'A');
			}
		}
		n = tangible.StringFunctions.changeCharacter(n, i + 1, '\0');
		System.out.println(n);
		System.in.read();
		System.in.read();
	}
}

