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
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char a[40];
	//	}
	//	words[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				words[i].a = tempVar2;
			}
			int b;
			b = String.valueOf(words[i].a).length();
			if (i < n - 1)
			{
				words[i].a[b] = ' ';
				words[i].a[b + 1] = '\0';
			}
		}
		int num = 0;
		for (i = 0;i < n;i++)
		{
			num += String.valueOf(words[i].a).length();
			if (num + String.valueOf(words[i + 1].a).length() > 81)
			{
					int k;
					k = String.valueOf(words[i].a).length();
					words[i].a[k - 1] = '\n';
					words[i].a[k] = '\0';
					num = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",words[i].a);
		}
		return 0;
	}



}

