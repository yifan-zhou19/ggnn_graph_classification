package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max;
		int m;
		int i;
		String str1 = new String(new char[11]);
		String str2 = new String(new char[4]);
		char c;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		c = System.in.read();
		n = str1.length();
		while (c != '\0' && n != 0)
		{
		   max = 0;
		   m = 0;
		   for (i = 0;i < n;i++)
		   {
			  if (str1.charAt(i) > max)
			  {
				max = str1.charAt(i);
				m = i;
			  }
		   }
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",str1.charAt(i));
			}
			System.out.printf("%s",str2);
			for (i = m + 1;i < n;i++)
			{
				System.out.printf("%c",str1.charAt(i));
			}
			System.out.print("\n");
			str1 = s;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str1 = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				str2 = tempVar4.charAt(0);
			}
			c = System.in.read();
			n = str1.length();
		}
	}
}

