package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[256]);
		String a = new String(new char[256]);
		String c = new String(new char[256]);
		int m;
		int n;
		int i;
		int j;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
						d = 1;
						for (j = 0;j < n;j++)
						{
										if (b.charAt(j) != a.charAt(j + i))
										{
										d = 0;
										}
						}
						if (d == 1)
						{
						  for (j = 0;j < n;j++)
						  {
							a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
						  }
										break;
						}

		}

	   System.out.printf("%s",a);

						  System.in.read();
						  System.in.read();
						  System.in.read();
						  System.in.read();
						  System.in.read();
						  System.in.read();
						  System.in.read();
							  System.in.read();
							  System.in.read();
							  System.in.read();
							  System.in.read();
							  System.in.read();
							  System.in.read();
							  System.in.read();
								  System.in.read();
								  System.in.read();
								  System.in.read();
								  System.in.read();
								  System.in.read();
								  System.in.read();
								  System.in.read();
	}
}

