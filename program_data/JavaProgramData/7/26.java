package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a = 1;
		int m;
		int k;
		String s1 = new String(new char[258]);
		String s2 = new String(new char[258]);
		String s3 = new String(new char[258]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (a == 1)
			{
				k = i;
				for (j = 0;s2.charAt(j) != '\0';j++)
				{
					if (s2.charAt(j) != s1.charAt(k))
					{
						a = 1;
						break;
					}
					k++;
					a = 0;
				}
			}
			else
			{
				break;
			}
		}
		if (a == 0)
		{
			for (m = 0;s3.charAt(m) != '\0';m++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i - 1, s3.charAt(m));
				i++;
			}
		}
		System.out.printf("%s",s1);
		return 0;
	}
}

