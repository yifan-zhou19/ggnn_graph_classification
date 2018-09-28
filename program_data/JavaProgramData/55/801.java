package <missing>;

public class GlobalMembers
{
	public static int cf(int a,int b)
	{
		int i;
		int s;
		if (b == 0)
		{
		s = 1;
		}
		for (s = 1,i = 1;i <= b;i++)
		{
		s = a * s;
		}
		 return (s);
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int t;
		int s;
		int j;
		int[] d = new int[1000];
		int k;
		String c = new String(new char[1000]);
		char x;
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
		t = c.length();
		for (i = 0;i <= t - 1;i++)
		{
			if (c.charAt(i) <= 'Z' && c.charAt(i) >= 'A')
			{
		   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A' + 10);
			}
		  if (c.charAt(i) <= 'z' && c.charAt(i) >= 'a')
		  {
		   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a' + 10);
		  }
		  if (c.charAt(i) <= '9' && c.charAt(i) >= '0')
		  {
		   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0');
		  }
		}
		  for (i = 0,j = t - 1,s = 0;i <= t - 1;i++,j--)
		  {
		   s = c.charAt(i) * cf(a, j) + s;
		  }
		   if (s == 0)
		   {
		   System.out.print("0");
		   }
		else
		{
			for (i = 0;s > 0;i++)
			{
			d[i] = s % b;
		  s = s / b;
			k = i;
			}

			for (i = k;i >= 0;i--)
			{
			if (d[i] <= 9)
			{
		  System.out.printf("%d",d[i]);
			}
		  else
		  {
		  System.out.printf("%c",d[i] - 10 + 'A');
		  }
			}
		}
	}

}

