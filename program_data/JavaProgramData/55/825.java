package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n = 0;
		int t = 0;
		int sum;
		String s = new String(new char[1000]);
		int[] q = new int[1000];
		int[] p = new int[1000];
		String m = new String(new char[1000]);
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
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		n = n + 1;
		}
		for (i = 0;i <= n - 1;i++)
		{
		if (s.charAt(i) > '9')
		{
							if (s.charAt(i) > 'Z')
							{
							s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a' + 10);
							}
							else
							{
							s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A' + 10);
							}
		}
		else
		{
		s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - '0');
		}
		}
		sum = 1;
		for (i = n - 1;i >= 0;i--)
		{
		t = s.charAt(i) * sum + t;
		sum = sum * a;
		}
		if (t == 0)
		{
		System.out.print("0");
		}
		q[0] = t;
		for (i = 0;q[i] != 0;i++)
		{
		   q[i + 1] = q[i] / b;
		}
		for (i = 0;q[i] != 0;i++)
		{
		  p[i] = q[i] % b;
		  if (p[i] > 9)
		  {
		  p[i] = p[i] - 10 + 'A';
		  }
		  else
		  {
		  p[i] = p[i] + '0' - 0;
		  }
		}
		p[i] = '\0';
		n = 0;
		for (i = 0;p[i] != '\0';i++)
		{
			n = n + 1;
		}
		for (i = 0;i <= n - 1;i++)
		{
		m = tangible.StringFunctions.changeCharacter(m, i, p[n - i - 1]);
		}
		m = tangible.StringFunctions.changeCharacter(m, n, '\0');
		System.out.printf("%s",m);
		System.in.read();
		System.in.read();
	}
}

