package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		int n;
		int i;
		int j;
		int m;
		int k;
		int s = 0;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		n = b.length();
		m = a.length();
		for (i = 0;i < m;i++)
		{
			s = 0;
			for (j = i,k = 0;k < n;j++,k++)
			{

				if (a.charAt(j) != b.charAt(k))
				{
					 s = 1;
					 break;
				}
			}
			if (s == 0)
			{
				break;
			}
		}

			if (s == 0)
			{
				for (d = i,e = 0;d < i + n;d++,e++)
				{
					a = tangible.StringFunctions.changeCharacter(a, d, c.charAt(e));
				}
			}
				System.out.printf("%s",a);




		return 0;
	}


}

