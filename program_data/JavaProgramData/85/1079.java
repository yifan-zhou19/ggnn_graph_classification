package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int[][] b = new int[100][1];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pr;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (pr = b;pr < *(b + n);pr++)
		{
			*pr = '0';
			a = new Scanner(System.in).nextLine();
			len = a.length();
			if ((*a > 'z' || *a < 'A') && *a != '_')
			{
				continue;
			}
			*pr = '1';
			for (p = a;p < a.Substring(len);p++)
			{
				if (((*p < 'A' && *p>'9') || *p > 'z' || *p < '0' || (*p >= 91 && *p <= 96)) && *p != '_')
				{
					*pr = '0';
					break;
				}
			}
		}
		for (pr = b;pr < *(b + n);pr++)
		{
			if (*pr == '1')
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}





}

