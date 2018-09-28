package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_j = 0;
	public static void Main(String[] args)
	{
		String str = new String(new char[50]);
		String str1 = new String(new char[50]);
		char[][] str2 = new char[50][50];
		int len1;
		int len2;
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		len1 = str.length();
		len2 = str1.length();
		n = len2 - len1 + 1;
		for (i = 0;i < n;i++)
		{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//		static int j=0;
			//printf("%d\n",j);
			for (k = 0;Main_j < len2,k < len1;Main_j++,k++)
			{
				str2[i][k] = (str1.Substring(Main_j));
				if (k == len1 - 1)
				{
					str2[i][k + 1] = '\0';
					Main_j = Main_j - len1 + 2;
					break;
				}
			}
		}
		/*for(i=0;i<n;i++)
		{
			puts(str2[i]);
		}*/
		for (i = 0;i < n;i++)
		{
			if (strcmp(str,str2[i]) == 0)
			{
				break;
			}
		}
		System.out.printf("%d",i);

	}
}

