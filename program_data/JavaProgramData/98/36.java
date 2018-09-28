package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] str = new char[800][80];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		int a = 0;
		int k = 0;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			a = a + String.valueOf(str[i]).length() + 1;

			if (a < 80 && ((a + String.valueOf(str[i + 1]).length() + 1) == 80 || (a + String.valueOf(str[i + 1]).length()) == 80)) //jia shang zui hou yi ge ci zheng hao 80(wu kong ge)//
			{
				for (j = k;j <= i;j++)
				{
					System.out.printf("%s ",str[j]);
				}
				System.out.printf("%s",str[j]);
				System.out.print("\n");
				a = 0;
				k = i + 2;
				i = i + 1;
			}

			if (a < 80 && (a + String.valueOf(str[i + 1]).length() + 1)>80)
			{
				for (j = k;j < i;j++)
				{
					System.out.printf("%s ",str[j]);
				}
				System.out.printf("%s",str[j]);
				System.out.print("\n");
				a = 0;
				k = i + 1;
			}

		}
		for (j = k;j < n - 1;j++)
		{
			System.out.printf("%s ",str[j]);
		}
		System.out.printf("%s",str[j]);
		return 0;
	}




}

