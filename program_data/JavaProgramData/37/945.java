package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] alpha = new int[26];
		int t;
		int i;
		int flag = 0;
		int out = 0;
		String a = new String(new char[10001]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		while (t > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}

			for (i = 0;i < 26;i++)
			{
				alpha[i] = 0;
			}

			p = a;

			while (*p != '\0')
			{
				alpha[*p - 'a']++;
				p++;
			}

			flag = 0;
			out = 0;
			for (p = a; * p != '\0';p++)
			{
				for (i = 0; i < 26 ;i++)
				{
					if (alpha[i] == 1 && (*p - 'a') == i)
					{
						flag = 1;
						out = 1;
						System.out.printf("%c\n", 'a' + i);
						break;
					}
				}
				if (1 == out)
				{
					break;
				}
			}

			if (0 == flag)
			{
				System.out.print("no\n");
			}


			t--;
		}
	}


}

