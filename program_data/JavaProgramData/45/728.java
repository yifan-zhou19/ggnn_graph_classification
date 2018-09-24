package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;

		 String s = new String(new char[50]);
		 String t = new String(new char[50]);
		 String m = new String(new char[102]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		System.in.read();
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 t = tempVar2.charAt(0);
		 }
		 a = s.length();
		 b = t.length();
	for (i = 0;i <= b - a;i++)
	{
		for (j = i;j <= i + a - 1;j++)
		{
			if (t.charAt(j) != s.charAt(j - i))
			{
		break;
			}
		}
		if (j == i + a)
		{
			System.out.printf("%d",i);
		break;
		}
		else
		{
			continue;
		}
	}
	return 0;
	}

}

