package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len1;
		int len2;
		int m = 0;
		int flag = 1;
		final String s = "";
		final String t = "";
		float p;
		float q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		len1 = s.length();
		len2 = t.length();
		if (len1 != len2)
		{
			System.out.print("error");
			flag = 0;
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G') || (t.charAt(i) != 'A' && t.charAt(i) != 'T' && t.charAt(i) != 'C' && t.charAt(i) != 'G'))
				{
					System.out.print("error");
					flag = 0;
					break;
				}
				else
				{
					if (s.charAt(i) == t.charAt(i))
					{
						m++;
					}
				}
			}
		}
		if (flag == 1)
		{
			q = (float)m / len1;
			if (q > p)
			{
				System.out.print("yes");
			}
			else
			{
			System.out.print("no");
			}
		}

		return 0;
	}







}

