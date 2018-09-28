package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int i;
		int j;
		int k;
		int m;
		int n;
		int count = 0;
		p1 = str1;
		p2 = str2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		m = str1.length();
		n = str2.length();
		for (i = 0;i < n;)
		{

			if (*p1 != str2.charAt(i))
			{
				i++;
				continue;
			}
			else if (*p1 == str2.charAt(i))
			{
				p2 = str2.Substring(i);
				for (p1 = str1,j = 0;j < m;)
				{
					if (*p2 != *p1)
					{
						count = count + 0;
						p1++;
						p2++;
						j++;
					}
					else if (*p2 == *p1)
					{
						count++;
						p1++;
						p2++;
						j++;
					}
				}
				if (count == m)
				{
					k = i;
					break;
				}
			}
			i++;
		}
		System.out.printf("%d",k);
		return 0;
	}

}

