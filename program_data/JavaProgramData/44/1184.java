package <missing>;

public class GlobalMembers
{
	public static void fy(String c)
	{
		int s = 0;
		int i = 0;
		int t = 1;
		if (c[0].equals('-') && !c[1].equals('0'))
		{
			System.out.print("-");
		i++;
		}
		for (i = i; !c[i].equals('\0'); i++)
		{
			s = s + (c[i] - '0') * t;
			t = t * 10;
		}
		System.out.printf("%d\n",s);
	}

	public static int Main()
	{
		int k;
		String a = new String(new char[1000]);
		for (k = 0;k < 6;k++)
		{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a = tempVar.charAt(0);
			   }
			   fy(a);
		}
		return 0;
	}

}

