package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		String s3 = new String(new char[256]);
		int i;
		int j;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
	//	printf("%s %s %s",s1,s2,s3);
		int k1 = s1.length();
		int k2 = s2.length();
		for (i = 0;i < k1;i++)
		{
			int k = 0;
			for (j = 0;j < k2;j++)
			{
				if (s1.charAt(i + j) != s2.charAt(j))
				{
					break;
				}
				if (s1.charAt(i + j) == s2.charAt(j))
				{
					k++;
				}
			}

			if (k == k2)
			{
				q = i;
				break;
			}
		}
		for (i = 0;i < k1;i++)
		{
			if (i != q)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			if (i == q)
			{
				System.out.printf("%s",s3);
				i = i + k2 - 1;
			}
		}



		return 0;
	}
}

