package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int sum = 0;
		int e = 0;
		float n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		String a = new String(new char[600]);
		String b = new String(new char[600]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		len = a.length();
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) != 65 && a.charAt(i) != 71 && a.charAt(i) != 67 && a.charAt(i) != 84)
				{
					System.out.print("error");
				e = 1;
				break;
				}
				if (b.charAt(i) != 65 && b.charAt(i) != 71 && b.charAt(i) != 67 && b.charAt(i) != 84)
				{
					System.out.print("error");
				e = 1;
				break;
				}
			}
			if (e == 0)
			{
				for (i = 0;i < len;i++)
				{
					if (a.charAt(i) == b.charAt(i))
					{
						sum++;
					}
				}
				if (sum * 1.0 / len > n)
				{
				System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}

	return 0;
	}

}

