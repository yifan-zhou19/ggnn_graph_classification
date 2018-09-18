package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		final String substr = "";
		final String re = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int i;
		int j;
		int k;
		for (n = 0;scanf("%s",str.charAt(n)) != EOF;n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tangible.StringFunctions.changeCharacter(substr, n, tempVar);
			}
		}
		for (i = 0,k = 0;i < n;i++)
		{
			p = str.charAt(i)[0];
			k = 0;
			for (j = 1; * (p + j) != '\0';j++)
			{
				if (*(p + k) < *(p + j))
				{
					k = j;
				}
			}
			for (j = 0;j <= k;j++,p++)
			{
				re.charAt(i)[j] = *p;
			}
			for (;j <= k + 3;j++)
			{
				re.charAt(i)[j] = substr.charAt(i)[j - k - 1];
			}
			for (; * p != '\0';p++,j++)
			{
				re.charAt(i)[j] = *p;
			}
		}
		for (i = 0;i < n;i++)
		{
			p = re.charAt(i)[0];
			for (; * p != '\0';p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.print("\n");
		}
	}
}

