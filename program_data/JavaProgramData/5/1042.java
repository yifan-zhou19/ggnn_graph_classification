package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int l;
		double k;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
			l = a.length();
			for (i = 0;i < l;i++)
			{
				if (!(a.charAt(i) == 65 || a.charAt(i) == 67 || a.charAt(i) == 71 || a.charAt(i) == 84) || !(b.charAt(i) == 65 || b.charAt(i) == 67 || b.charAt(i) == 71 || b.charAt(i) == 84))
				{
					System.out.print("error");
					break;
				}
				else
				{
					if (a.charAt(i) == b.charAt(i))
					{
						n = n + 1;
					}
					if (i == l - 1)
					{
						if (1.0 * n / l >= k)
						{
							System.out.print("yes");
						}
						else
						{
							System.out.print("no");
						}
					}
				}
			}
		}
		return 0;
	}
}

