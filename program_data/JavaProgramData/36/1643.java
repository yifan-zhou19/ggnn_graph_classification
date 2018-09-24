package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1;
		int len2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct abc
	//	{
	//		int a[1000];
	//		char s[1000];
	//	};
		abc s1 = new abc();
		abc s2 = new abc();
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1.s = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2.s = tempVar2;
		}
		len1 = s1.s.length();
		len2 = s2.s.length();


		if (len1 != len2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				s2.a[i] = 0;
			}

			for (i = 0;i < len1;i++)
			{
				for (j = 0;j < len1;j++)
				{
					if (s2.a[j] == 0 && s2.s[j] == s1.s[i])
					{
						s2.a[j] = 1;
						break;
					}
				}
			}

			for (i = 0;i < len1;i++)
			{
				if (s2.a[i] == 0)
				{
					break;
				}
			}

			if (i == len1)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}
}

