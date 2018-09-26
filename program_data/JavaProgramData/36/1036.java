package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] ALPHA1 = new int[27];
		int[] alpha1 = new int[27];
		int[] ALPHA2 = new int[27];
		int[] alpha2 = new int[27];
		int len1;
		int len2;
		int j;
		int i;
		int flag;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		for (i = 0;i < 26;i++)
		{
			alpha1[i] = 0;
			ALPHA1[i] = 0;
			alpha2[i] = 0;
			ALPHA2[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		len1 = str1.length();
		len2 = str2.length();
		for (j = 0;j < len1;j++)
		{
			for (i = 0;i < 26;i++)
			{
				if (str1.charAt(j) - 'a' == i)
				{
					alpha1[i]++;
				}
				if (str1.charAt(j) - 'A' == i)
				{
					ALPHA1[i]++;
				}
			}
		}
		for (j = 0;j < len2;j++)
		{
			for (i = 0;i < 26;i++)
			{
				if (str2.charAt(j) - 'a' == i)
				{
					alpha2[i]++;
				}
				if (str2.charAt(j) - 'A' == i)
				{
					ALPHA2[i]++;
				}
			}
		}

		flag = 0;
		for (i = 0;i < 26;i++)
		{
			if (alpha1[i] == alpha2[i] && ALPHA1[i] == ALPHA2[i])
			{
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if (1 == flag)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}

	}


}

