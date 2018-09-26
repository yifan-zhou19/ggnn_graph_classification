package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[501]);
	public static int len;
	public static int lookfor(int k)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int i;
		int p1 = 1;
		int j;
		for (i = 0;i <= len - k;i++)
		{
			p = a.charAt(i);
			p1 = 1;
			q = a.charAt(i + k - 1);
			while (p < q)
			{
				if (*p != *q)
				{
					p1 = 0;
					break;
				}
				p++;
				q--;
			}
			if (p1 == 1)
			{
				for (j = 0;j <= k - 1;j++)
				{
					System.out.print(a.charAt(j + i));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 2;i <= len;i++)
		{
		lookfor(i);
		}
		return 0;
	}


}

