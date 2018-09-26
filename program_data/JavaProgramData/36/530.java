package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char temp;
		int i;
		int j;
		int n;
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
		n = s1.length() - 1;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if (s1.charAt(j) > s1.charAt(j + 1))
				{
					temp = s1.charAt(j + 1);
					s1 = tangible.StringFunctions.changeCharacter(s1, j + 1, s1.charAt(j));
					s1 = tangible.StringFunctions.changeCharacter(s1, j, temp);
				}
	//			printf("%c",s1[j]);
			}
		}
	//	printf("%s",s2);
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if (s2.charAt(j) > s2.charAt(j + 1))
				{
					temp = s2.charAt(j + 1);
					s2 = tangible.StringFunctions.changeCharacter(s2, j + 1, s2.charAt(j));
					s2 = tangible.StringFunctions.changeCharacter(s2, j, temp);
				}
			}
		}
	//	printf("%c %s\n",s1[0],s2);
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}


	}
}

