package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int c;
	int d;
	int e;
	int f;
	int l;
	int x;
	int i;
	String b = new String(new char[40000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	l = b.length();
	if (b.charAt(0) == '0')
	{
	System.out.print("0\n");
	}
	else
	{
		for (d = 0;d < l;d++)
		{
						if (b.charAt(d) >= 'A' && b.charAt(d) <= 'Z')
						{
						b = tangible.StringFunctions.changeCharacter(b, d, b.charAt(d) - 'A'+'a');
						}
		}
		x = 0;
		for (e = 0;e < l;e++)
		{
				 if (b.charAt(e) >= 'a')
				 {
				 f = b.charAt(e) - 'a' + 10;
				 }
				 else
				 {
				 f = b.charAt(e) - '0';
				 }
				 x = f + x * a;
		}
		int[] g = new int[40000];
		for (e = 0;x != 0;e++)
		{
			   g[e] = x % c;
			   x = x / c;
		}
		String h = new String(new char[40000]);
		for (i = 0;i < e;i++)
		{
			   if (g[i] < 10)
			   {
			   h = tangible.StringFunctions.changeCharacter(h, e - i - 1, g[i] + '0');
			   }
			   else
			   {
			   h = tangible.StringFunctions.changeCharacter(h, e - i - 1, g[i] + 'A' - 10);
			   }
		}
		 h = tangible.StringFunctions.changeCharacter(h, e, '\0');
		 System.out.printf("%s",h);
	}
	System.in.read();
	System.in.read();
	}














}

