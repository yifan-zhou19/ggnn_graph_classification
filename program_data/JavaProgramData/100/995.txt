package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int[] num = new int[26];
		String zfc = new String(new char[LEN]);
		int len;
		int i;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		 len = zfc.length();
		for (i = 0;i < len;i++)
		{
			if (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z')
			{
				num[zfc.charAt(i) - 'a']++;
			}
		}
		flag = 1;
		for (i = 0;i < 26;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,num[i]);
				flag = 0;
			}
		}
		if (flag != 0)
		{
			System.out.print("No");
		}

		return 0;

	}

}

