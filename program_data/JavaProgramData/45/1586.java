package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		int n1;
		int n2;
		int i;
		int j;
		int k;
		int jishuqi;
		int record;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		n1 = str1.length();
		n2 = str2.length();
		for (i = 0;i <= n2 - 1;i++)
		{
			jishuqi = 0;
			k = 0;
			for (j = i;j <= i + n1 - 1;j++,k++)
			{
				if (str1.charAt(k) == str2.charAt(j))
				{
					record = i;
					jishuqi = jishuqi + 1;
				}
			}
				if (jishuqi == n1)
				{
					System.out.printf("%d",record);
					break;
				}
		}
		return 0;
	}
}

