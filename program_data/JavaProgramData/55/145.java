package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int t = 0;
		int j = 1;
		int t1;
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		k = a.length();
		for (i = k - 1;i >= 0;i--)
		{
			   if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
			   {
				   t = t + (a.charAt(i) - 48) * j;
			   }
			  else if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			  {
				  t = t + (a.charAt(i) - 55) * j;
			  }
			  else if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			  {
				  t = t + (a.charAt(i) - 87) * j;
			  }
			  j = j * m;
		}
		if (t == 0)
		{
			System.out.printf("%d",t);
		}
		else
		{
			i = 0;
		while (t > 0)
		{
			   t1 = t % n;
			  t = t / n;
			  if (t1 <= 9)
			  {
				  b = tangible.StringFunctions.changeCharacter(b, i, t1 + 48);
			  }
			  else
			  {
				  b = tangible.StringFunctions.changeCharacter(b, i, t1 + 55);
			  }
			  i++;
		}
		for (j = 0;j < i;j++)
		{
			   c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(i - 1 - j));
			  System.out.printf("%c",c.charAt(j));
		}
		}
		System.out.print("\n");
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
	}


}

