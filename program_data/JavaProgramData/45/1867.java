package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int n = s1.length();
		int m = s2.length();
		int d = 0;
		int k = 0;
		for (p = s2; * p != '\0';p++)
		{
			k++;
			if (s1.charAt(0) == *p)
			{
				for (int i = 0;i < n - 1;i++)
				{
					if (s1.charAt(i) == *p)
					{
						d++;
						p++;
					}
					else
					{
						break;
					}
				}
				if (d == n - 1)
				{

					System.out.printf("%d",k - 1);
				}
			}

		}
		return 0;
	}


}

