package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String p;
		int c;
		int i;
		int j = 0;
		int k;
		int[] b = new int[26];
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
		}
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		c = a.length();
		for (i = 0;i < c + 1;i++)
		{
			for (k = 0;k < 26;k++)
			{
				 if (a.charAt(i) == k + 'a')
				 {
				 b[k]++;
				 }
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',b[i]);
				j++;
			}
		}
		 if (j == 0)
		 {
			 System.out.print("No");
		 }
		 return 0;
	}
}

