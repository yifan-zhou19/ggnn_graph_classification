package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		p = str1;
		q = str2;
		while (*q != '\0')
		{
			if (*q == *p)
			{
				t = q;
				m = 1;
				for (; * p != '\0';p++,q++)
				{
					if (*p != *q)
					{
						m = 0;
						break;
					}
				}
				if (m != 0)
				{
					System.out.printf("%d\n",t - str2);
					break;
				}
				else
				{
					q++;
					p = str1;
				}
			}
			else
			{
				q++;
			}
		}
	}



}

