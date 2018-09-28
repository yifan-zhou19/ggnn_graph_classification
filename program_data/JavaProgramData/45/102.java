package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int t1;
		int t2;
		t1 = s.length();
		t2 = w.length();
		int i;
		int j;
		int n;
		i = t1 - 1;
		for (j = 0;j < t2;j++)
		{
				if (s.charAt(0) == w.charAt(j) && s.charAt(i) == w.charAt(j + i))
				{
					n = j;
					break;
				}
		}
		System.out.printf("%d",n);
	}

}

