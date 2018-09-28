package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int len;
		int t = 0;
		char a;
		String str = new String(new char[90]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = System.in.read();
		for (i = 0;i < n;i++)
		{
			a = System.in.read();
			if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a == '_')
			{
				str = new Scanner(System.in).nextLine();
				len = str.length();
				for (p = str;p < str.Substring(len);p++)
				{
					if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p >= '0' && *p <= '9') || (*p == '_'))
					{
						t++;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
				}
				if (t == len)
				{
					System.out.print("1\n");
				}
			}
			else
			{
				str = new Scanner(System.in).nextLine();
				System.out.print("0\n");
			}
			t = 0;
			for (p = str;p < str.Substring(90);p++)
			{
				*p = '\0';
			}
		}
	}




}

