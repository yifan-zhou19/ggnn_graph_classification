package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[maxl + 1]);
		char t;
		int ans = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		t = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if ((s.charAt(i) == t) || (s.charAt(i) == t - 'A'+'a'))
			{
			ans++;
			}
			else
			{
				if (i == 0)
				{
				ans++;
				}
				else
				{
					System.out.printf("%d)",ans);
					ans = 1;
				}
				if ((s.charAt(i) <= 'z') && (s.charAt(i) >= 'a'))
				{
				t = s.charAt(i) - 'a'+'A';
				}
				else
				{
				t = s.charAt(i);
				}
				System.out.printf("(%c,",t);
			}

		}
		System.out.printf("%d)",ans);

	}

}

