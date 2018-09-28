package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[50]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int count;
		int x;
		for (int j = 1;j <= n;j++)
		{
			count = 0;
			x = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
			for (int i = 0;sz.charAt(i) != '\0';i++)
			{
				x++;
				if (sz.charAt(0) == '_' || (sz.charAt(0) >= 'a' && sz.charAt(0) <= 'z') || (sz.charAt(0) >= 'A' && sz.charAt(0) <= 'Z'))
				{
					if (sz.charAt(i) >= '0' && sz.charAt(i) <= '9')
					{
						count++;
					}
					if (sz.charAt(i) >= 'a' && sz.charAt(i) <= 'z')
					{
						count++;
					}
					if (sz.charAt(i) >= 'A' && sz.charAt(i) <= 'Z')
					{
						count++;
					}
					if (sz.charAt(i) == '_')
					{
						count++;
					}
				}
			}
			if (count == x)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

