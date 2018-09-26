package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		String s3 = new String(new char[50]);
		int i;
		int m;
		int j;
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		n = s1.length();
		m = s2.length();
		for (i = 0;i < m - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
			s3 = tangible.StringFunctions.changeCharacter(s3, j, s2.charAt(j + i));
			}
			s3 = tangible.StringFunctions.changeCharacter(s3, n, '\0');
			if (strcmp(s1,s3) == 0)
			{
				k = i;
				break;
			}

		}
		System.out.printf("%d",k);
	}
}

