package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ltr = new String(new char[100000]);
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		int count = 0;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ltr = tempVar2.charAt(0);
			}
			for (p = ltr;p < ltr + ltr.length();p++)
			{
				for (t = ltr;t < ltr + ltr.length();t++)
				{
					if (*t == *p)
					{
						count++;
					}
				}
				if (count == 1)
				{
					k++;
					System.out.printf("%c\n",*p);
					break;
				}
				count = 0;
			}
			if (k == 0)
			{
				System.out.print("no\n");
			}
			count = 0;
			k = 0;
		}
		return 0;
	}
}

