package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word1 = new String(new char[100]);
		String word2 = new String(new char[100]);
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int i = 0;
		int len;
		int j;
		int num = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word2 = tempVar2.charAt(0);
		}
		p1 = word1;
		len = word1.length();
		for (p2 = word2; * p2 != '\0';p2++)
		{
			i++;
			for (j = 0;j < len;j++)
			{
				if (*p2 + j == p1.Substring(j))
				{
					num++;
				}
				if (num == len)
				{
					a = i - 1;
					break;
				}
			}
			if (a != 0)
			{
				break;
			}
		}
		System.out.printf("%d",a);
		return 0;
	}



}

