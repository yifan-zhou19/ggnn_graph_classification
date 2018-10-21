package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();

		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			int l;
			l = s.length();
			int[] count = new int[26];
			p = s;
			while (*p != '\0')
			{
				count[(int) * p - 97]++;
				p++;
			}
			p = s;
			while (*p != '\0')
			{
				if (1 == count[(int) * p - 97])
				{
					System.out.printf("%c\n",*p);
					break;
				}
				p++;
			}
			if (*p == '\0')
			{
				System.out.print("no\n");
			}
		}


		return 0;
	}

}

