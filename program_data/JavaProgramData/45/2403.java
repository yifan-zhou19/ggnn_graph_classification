package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int num;
		int isbreak = 0;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len = s.length();
		for (i = 0;i < 50;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				num = i;
				for (j = 1;s.charAt(j) != '\0';j++,i++)
				{
					if (s.charAt(j) != w.charAt(i))
					{
						break;
					}
				}
				if (j - 1 == len)
				{
					isbreak = 1;
				}
				break;
			}
			if (isbreak == 1)
			{
				break;
			}
		}


		System.out.printf("%d",num);
		return 0;
	}



}

