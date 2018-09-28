package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int a_;
		int b_;
		int isbreak = 0;
		int i;
		int j;
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
		a_ = a.length();
		b_ = b.length();
		if (a_ != b_)
		{
			System.out.print("NO\n");
		}
		else
		{
		for (i = 0; i < a_; i++)
		{
			for (j = 0; j < b_; j++)
			{
				if (b.charAt(i) == a.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '0');
					break;
				}
				if (j == b_ - 1)
				{
					isbreak = 1;
					break;
				}
			}
			if (isbreak == 1)
			{
				break;
			}
		}
		if (isbreak == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.print("YES\n");
		}
		}
		return 0;
	}


}

