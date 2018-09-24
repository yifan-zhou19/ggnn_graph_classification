package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		final String c = "";
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int n1;
		int n2;
		n1 = c.length();
		n2 = s.length();
		int i = 0;
		int j;
		int a;
		int count = 0;
		for (j = 0;j < n2 - n1 + 1;j++)
		{
			if (c.charAt(i) == s.charAt(j))
			{
				a = j;
				for (i = i + 1;i < n1;i++)
				{
					j = j + 1;
					if (c.charAt(i) != s.charAt(j))
					{
						count++;
					}
				}
				if (count == 0)
				{
					System.out.printf("%d\n",a);
					break;
				}
			}
		}
	}


}

