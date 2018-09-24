package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int l;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int[] zimu = new int[26];
			String string = new String(new char[100000]);
			char m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				String = tempVar2;
			}
			l = String.length();
			for (j = 97;j <= 122;j++)
			{
				for (n = 0;n < l;n++)
				{
					if (j == string.charAt(n))
					{
					   zimu[j - 97]++;
					}
				}
			}
			for (j = 0,n = 0;j < l;j++)
			{
				if (zimu[string.charAt(j) - 97] == 1)
				{
				   System.out.printf("%c\n",string.charAt(j));
				   n = 1;
				   break;
				}
			}
			if (n == 0)
			{
			System.out.print("no\n");
			}
		}
		System.in.read();
		System.in.read();
	}


}

