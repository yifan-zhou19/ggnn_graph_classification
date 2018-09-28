package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l2;
		int l3;
		int e = 0;
		int sum = 0;
		String s = new String(new char[300]);
		String z = new String(new char[300]);
		String h = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h = tempVar3.charAt(0);
		}
		l1 = s.length();
		l2 = z.length();
		l3 = h.length();
		for (i = 0;i <= l1 - l2;i++)
		{
			e = 0;
			for (j = 0;j < l2;j++)
			{
				if (z.charAt(j) == s.charAt(j + i))
				{
				  e++;
				}

			}

			if (e == l2)
			{
				for (j = 0;j < i;j++)
				{
				  System.out.printf("%c",s.charAt(j));
				}
				for (j = 0;j < l3;j++)
				{
				   System.out.printf("%c",h.charAt(j));
				}
				if (i + l2 < l1 - 1)
				{
					for (j = i + l2;j < l1;j++)
					{
					   System.out.printf("%c",s.charAt(j));
					}
				}
				sum++;
			   break;
			}
		}
		if (sum == 0)
		{
		  for (i = 0;i < l1;i++)
		  {
			 System.out.printf("%c",s.charAt(i));
		  }
		}
		return 0;
	}
}

