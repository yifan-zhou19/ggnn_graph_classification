package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		int[] rec = new int[30];
		int i;
		int t;
		int len;
		int find;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			find = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(rec,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0; i < len ;i++)
			{
				rec[s.charAt(i) - 'a']++;
			}
			for (i = 0; i < len ;i++)
			{
				if (rec[s.charAt(i) - 'a'] == 1)
				{
					System.out.printf("%c\n",s.charAt(i));
					find = 1;
					break;
				}
			}
			if (find == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

