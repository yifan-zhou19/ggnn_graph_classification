package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String s = new String(new char[50]);
		 String w = new String(new char[50]);
		 int i;
		 int k;
		 int ls;
		 int lw;
		 int a;
		 int m = 0;
		 int x = 0;
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
		 ls = s.length();
		 lw = w.length();
		 for (i = 0;i < lw;i++)
		 {
			if (w.charAt(i) == s.charAt(0))
			{
				a = i;
				for (k = 0;k < ls;k++)
				{
					if (w.charAt(i + k) != s.charAt(k))
					{
						m = 1;
						break;
					}
				}
				if (m == 0)
				{
					x = 1;
					break;
				}
			}
		 }
		if (x == 1)
		{
			System.out.printf("%d",a);
		}

		return 0;
	}
}

