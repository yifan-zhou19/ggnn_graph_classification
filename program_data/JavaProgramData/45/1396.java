package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int k;
		int a = 0;
		int b = 0;
		int c = 0;
		int lens = 0;
		int lenw = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		a = s.length();
		b = w.length();
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				for (k = 0;k < b - j;k++)
				{
					if (s.charAt(i) == w.charAt(j + k))
					{
						c = j + k;
						break;
					}
				}
				break;
			}
			break;
		}
		System.out.printf("%d",c);
		return 0;
	}
}

