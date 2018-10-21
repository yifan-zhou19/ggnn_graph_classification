package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[100000]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int s = 0;
			int t;
			int l;
			int j;
			int k;
			l = a.length();
			for (j = 0;j < l;j++)
			{
				t = 0;
				for (k = 0;k < l;k++)
				{
				if (a.charAt(j) == a.charAt(k))
				{
					t++;
				}
				}
				if (t == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
				break;
				}
				s++;
			}
			if (s == l)
			{
				System.out.print("no\n");
			}
		}

	}
}

