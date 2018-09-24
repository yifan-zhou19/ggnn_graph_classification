package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int w1;
		int w2;
		int b;
		double n;
		double k;
		a = 0;
		b = 0;
		String s1 = new String(new char[502]);
		String s2 = new String(new char[502]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Double.parseDouble(tempVar);
		 }
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			w1 = s1.length();
			w2 = s2.length();

		if (w1 != w2)
		{
			 System.out.print("error");
			 b = 1;
		}
		else
		{
			for (i = 0;i < w1;i++)
			{
				if ((s1.charAt(i) == 'A' || s1.charAt(i) == 'T' || s1.charAt(i) == 'C' || s1.charAt(i) == 'G') && (s2.charAt(i) == 'A' || s2.charAt(i) == 'T' || s2.charAt(i) == 'C' || s2.charAt(i) == 'G'))
				{
					if (s1.charAt(i) == s2.charAt(i))
					{
								   a++;
					}
				}

				else
				{
					 System.out.print("error");
					 b = 1;
					 break;
				}
			}
				k = 1.0 * a / w1;
				if (k > n && b == 0)
				{
					System.out.print("yes");
				}
				else if (k <= n != 0 && b == 0)
				{
					System.out.print("no");
				}
		}
		return 0;
	}
}

