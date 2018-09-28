package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		int n;
		int i;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			k = 1;
			p = str;
			if (((*p >= 1 && *p <= 64) || (*p >= 91 && *p <= 96) || (*p >= 123)) && *p != '_')
			{
				k = 0;
			}
			p++;
			while (*p != '\0')
			{
				if (((*p >= 1 && *p <= 47) || (*p >= 58 && *p <= 64) || (*p >= 91 && *p <= 96) || (*p >= 123)) && *p != '_')
				{
					k = 0;
					p++;
				}
				else
				{
					p++;
				}
			}
			System.out.printf("%d\n",k);
		}
	}
}

