package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int lena;
		int i = 0;
		int k;
		int t;
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
		lena = a.length();
		while (true)
		{
			if (a.charAt(0) != b.charAt(i))
			{
				i++;
				continue;
			}
			t = 0;
			for (k = 1;k < lena;++k)
			{
				if (a.charAt(k) != b.charAt(i + k))
				{
					t = 1;
				}
			}
			if (t != 0)
			{
				continue;
			}
			System.out.printf("%d",i);
			break;
		}
	}


}

