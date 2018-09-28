package <missing>;

public class GlobalMembers
{
	// 1.cpp : Defines the entry point for the console application.
	//
	public static int[] num = new int[26];
	public static int Main()
	{
		String sz = new String(new char[100001]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int t;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= t;i++)
		{
			sz = new Scanner(System.in).nextLine();
			m = sz.length();
			p = sz;
			n = 0;
			int[] num = new int[26];
			int[] pm = num;
			for (p = sz;p < sz.Substring(m);p++)
			{
				(pm[(*p - 97)])++;
			}
			for (p = sz;p < sz.Substring(m);p++)
			{
				if ((pm[(*p - 97)]) == 1)
				{
					n = -1;
					System.out.printf("%c\n",*p);
					break;
				}
				else
				{
					n++;
				}
			}
			if (n != 0 && n != -1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

