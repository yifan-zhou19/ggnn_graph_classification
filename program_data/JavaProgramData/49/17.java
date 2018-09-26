package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p;
		int q;
		int k;
		int len;
		String s = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 2;i <= len;i++) //????
		{
			for (j = 0;j <= len - i;j++) //????
			{
				p = j;
				q = j + i - 1;
				while (p < q)
				{
					if (s.charAt(p) == s.charAt(q))
					{
						p++;
						q--;
					}
					else
					{
						break;
					}
					if (p == q + 1 || p == q)
					{
						for (k = j;k <= j + i - 2;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.printf("%c\n",s.charAt(j + i - 1));
						break;
					}
				}
			}
		}
	}
}

