package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int l;
		int count;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (j = 0;j < l;j++)
			{
				count = 0;
				for (k = 0;k < l;k++)
				{
					if (a.charAt(k) == a.charAt(j))
					{
						count++;
					}
				}
				if (count == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
				else if ((j == l - 1) && (count != 1))
				{
					System.out.print("no\n");
				}
			}
		}
	}
}

