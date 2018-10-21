package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int count;
		int a = 1;
		int b = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String zfc = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			count = 0;
			zfc = new Scanner(System.in).nextLine();
			len = zfc.length();
			p = zfc;
			if (*p == '_' || (*p >= 'A' && *p <= 'z'))
			{
				for (p = zfc.Substring(1);p < zfc.Substring(len);p++)
				{
					if (*p != '_' && (*p < '0' || (*p>'9' && *p < 'A') || *p>'z'))
					{
						System.out.printf("%d\n",b);
						break;
					}
					count++;
				}
				if (count == len - 1)
				{
					System.out.printf("%d\n",a);
				}
			}
			else
			{
				System.out.printf("%d\n",b);
			}
		}
		return 0;
	}
}

