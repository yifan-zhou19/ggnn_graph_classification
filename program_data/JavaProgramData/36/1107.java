package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] num1 = new int[52];
		int[] num2 = new int[52];
		int[] ASC = new int[52];
		int i;
		int j;
		int len1;
		int len2;
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
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0;i < 26;i++)
		{
			ASC[i] = 65 + i;
		}
		for (i = 0;i < 26;i++)
		{
			ASC[i + 26] = 97 + i;
		}
		for (p = s1;p < s1.Substring(len1);p++)
		{
			for (j = 0;j < 52;j++)
			{
				if (*p == ASC[j])
				{
					num1[j]++;
					break;
				}
			}
		}
		for (p = s2;p < s2.Substring(len2);p++)
		{
			for (j = 0;j < 52;j++)
			{
				if (*p == ASC[j])
				{
					num2[j]++;
					break;
				}
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (num1[i] != num2[i])
			{
				System.out.print("NO");
				break;
			}
			else if (i == 51)
			{
				System.out.print("YES");
			}
		}
		return 0;
	}
}

