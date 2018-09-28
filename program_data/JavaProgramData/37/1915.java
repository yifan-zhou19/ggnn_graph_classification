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
			int j;
			int k;
			int t;
			int s = 0;
			for (j = 0;j < a.length();j++)
			{
				t = 0;
				for (k = 0;k < a.length();k++)
				{
				if (a.charAt(k) == a.charAt(j))
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
			if (s == a.length())
			{
				System.out.print("no\n");
				break;
			}
		}

	}
}

