package <missing>;

public class GlobalMembers
{
	public static void rearrange(String c)
	{
		int i;
		int j;
		int len;
		char temp;
		len = c.length();
		for (i = 0;i < len;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				if (c[i].compareTo(c[j]) > 0)
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
	}


	public static void compare(String c1, String c2)
	{
		int i;
		int j;
		int total = 0;
		int len1;
		int len2;
		len1 = c1.length();
		len2 = c2.length();
		if (len1 != len2)
		{
			System.out.print("NO");
		}
		else if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (c1[i].equals(c2[i]))
				{
					total++;
				}
			}
			if (total == len1)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}

	public static void Main()
	{
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		rearrange(c1);
		rearrange(c2);
		compare(c1, c2);
	}

}

