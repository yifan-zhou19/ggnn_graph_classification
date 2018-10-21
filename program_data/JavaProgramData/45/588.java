package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		p = s;
		q = w;
		do
		{
			if (*p == *q)
			{
				if (*p == '\0')
				{
					System.out.printf("%d",q - s.length() - w);
					return;
				}
				else
				{
					p++;
					q++;
				}
			}
			else
			{
				if (*p == '\0')
				{
					System.out.printf("%d",q - s.length() - w);
					return;
				}
				else
				{
					p = s;
					q++;
				}
			}
		}while (q != '\0');
	}

}

