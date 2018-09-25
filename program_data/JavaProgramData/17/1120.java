package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static right(String s, int i, int n)
	{
		int j;
		int left = 0;
		int right = 0;
		int num = 0;

		for (j = i + 1;j < n;j++)
		{
			if (s[j].equals('('))
			{
				right++;
			}
			if (s[j].equals(')'))
			{
				left++;
			}
			if (right < left)
			{
				num = 1;
				break;
			}
		}
		return (num);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static left(String s, int i)
	{
		int j;
		int left = 0;
		int right = 0;
		int num = 0;

		for (j = i - 1;j >= 0;j--)
		{
			if (s[j].equals('('))
			{
				right++;
			}
			if (s[j].equals(')'))
			{
				left++;
			}
			if (right > left)
			{
				num = 1;
				break;
			}
		}
		return (num);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static trans(String s1, String s2)
	{
		int len;
		int i;
		len = s1.length();

		for (i = 0;i < len;i++)
		{
				s2[i] = ' ';

				if (s1[i].equals(')'))
				{
					if (left(s1,i) == 0)
					{
						s2[i] = '?';
					}
				}

				if (s1[i].equals('('))
				{
					if (right(s1,i,len) == 0)
					{
						s2[i] = '$';
					}
				}
		}
		s2[len] = '\0';
		return;
	}



	public static int Main()
	{
		int i;
		int j;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct aaa
	//	{
	//		char s1[105];
	//		char s2[105];
	//	};
		aaa[] line = tangible.Arrays.initializeWithDefaultaaaInstances(20);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}



		for (i = 0;i < n;i++)
		{
			line[i].s1 = new Scanner(System.in).nextLine();
			trans(line[i].s1, line[i].s2);
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n%s\n",line[i].s1,line[i].s2);
		}
	}
}

