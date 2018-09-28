package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int LEN;
		int NUM1;
		int NUM2;
		int tmp = 0;
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("NO\n");
		}
		else
		{
			LEN = a.length();
			for (i = 0; i < LEN; i++)
			{
				NUM1 = 0;
				NUM2 = 0;
				for (j = 0; j < LEN; j++)
				{
					if (a.charAt(i) == a.charAt(j))
					{
						NUM1++;
					}
				}
				for (j = 0; j < LEN; j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						NUM2++;
					}
				}
				if (NUM1 != NUM2)
				{
					System.out.print("NO\n");
					break;
				}
				tmp++;
			}
			if (tmp == LEN)
			{
				System.out.print("YES\n");
			}
		}
	}
}

