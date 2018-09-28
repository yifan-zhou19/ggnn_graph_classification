package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		final String c = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			final String o = "\0";
			k = c.length();
			final String v = "\0";
			v = c.substring(0, k - 3);
			v += "ing";
			if (strcmp(v,c) == 0)
			{
				o = c.substring(0, k - 3);
				System.out.printf("%s\n",o);
			}
			else
			{
				o = c.substring(0, k - 2);
				System.out.printf("%s\n",o);
			}
		}
	}






}

