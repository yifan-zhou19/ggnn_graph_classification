package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num;
		int len;
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len = w.length();
		for (i = 0;i < n;i++)
		{
			if (num + len <= 80)
			{
				if (i != n - 1)
				{
					System.out.printf("%s",w);
					num = num + len + 1;
				}
				else
				{
				System.out.printf("%s",w);
				}
			}
			else
			{
				System.out.print("\n");
				num = len + 1;
				System.out.printf("%s",w);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w = tempVar3.charAt(0);
			}
			len = w.length();
			if ((num + len <= 80) && (i != n - 1))
			{
			System.out.print(" ");
			}
		}
	}

}

