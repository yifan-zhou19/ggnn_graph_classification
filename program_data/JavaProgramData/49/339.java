package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int slen = s.length();
		int i;
		int j;
		int k = LEN;
		for (i = 2;i <= slen;i++)
		{
			for (j = 0;(j + i) <= slen;j++)
			{
				for (k = j;k <= (j + i - 1);k++)
				{
				   if (s.charAt(k) != s.charAt(2 * j + i - 1 - k))
				   {
					   break;
				   }
				}
				if (k == (j + i))
				{
				   for (k = j;k <= (j + i - 1);k++)
				   {
					   System.out.printf("%c",s.charAt(k));
					   if (k == (j + i - 1))
					   {
						   System.out.print("\n");
					   }
				   }
				}
				k = LEN;
			}
		}
		System.in.read();
		System.in.read();
		System.in.read();


	}

}

