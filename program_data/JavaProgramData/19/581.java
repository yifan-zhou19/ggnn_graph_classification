package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str1 =
		{
			{0, 0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
		String str4 = new String(new char[100]);
		int n;
		int i = 0;
		int j = 0;
		int[] k = new int[100];
		int m = 0;
		str2 = new Scanner(System.in).nextLine();
		scanf("\n");
		str3 = new Scanner(System.in).nextLine();
		scanf("\n");
		str4 = new Scanner(System.in).nextLine();
		n = str2.length();
		m = str4.length();
		for (i = 0;i < n;i++)
		{
			if (str2.charAt(i) == ' ')
			{
				j = j + 1;
				k[j] = 0;
			}
			else
			{
				str1[j][k[j]] = str2.charAt(i);
				k[j] = k[j] + 1;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (strcmp(str1[i],str3) == 0)
			{
				if (k[i] < m)
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(str1[i],0,m);
				str1[i] = str4;
				}
				else
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(str1[i],0,k[i]);
					str1[i] = str4;
				}
			}
		}

			System.out.printf("%s",str1[0]);
			for (i = 1;i <= j;i++)
			{
				System.out.printf(" %s",str1[i]);
			}
	}

}
