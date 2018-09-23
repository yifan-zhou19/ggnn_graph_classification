package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] b = new int[26];
		int i;
		int len;
		for (i = 0;i < 26;i++)
		{
		b[i] = 0;
		}
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (p = a;p < (a.Substring(len));p++)
		{
			for (i = 0;i < 26;i++)
			{
				if (*p == 'a' + i)
				{
					b[i]++;
				}
			}
		}
				len = 0;
		for (i = 0;i < 26;i++)
		{
		if (b[i] != 0)
		{
			System.out.printf("%c=%d\n",'a' + i,b[i]);
			len++;
		}
		}

		if (len == 0)
		{
		System.out.print("No");
		}
	}

}
