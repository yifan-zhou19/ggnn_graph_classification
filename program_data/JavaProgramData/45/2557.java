package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[11];
		int i;
		int j;
		int t;
		int e;
		String s = new String(new char[60]);
		String w = new String(new char[60]);
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


		for (i = 0;i <= 50;i++)
		{
			e = 1;
			for (j = 0;j < s.length();j++)
			{
				if (s.charAt(j) != w.charAt(j + i))
				{
					e = 0;
				}
			}
			if (e != 0)
			{

				System.out.printf("%d",i);
				return 0;
			}
		}

		return 0;
	}


}

