package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			p = s2.charAt(i);
			for (j = 0;s1.charAt(j) != '\0';j++)
			{
				if (*p != s1.charAt(j))
				{
					break;
				}
				else
				{
					p++;
				}
			}
			if (s1.charAt(j) == '\0')
			{
				k = i;
				break;
			}
		}
		System.out.printf("%d",k);
	}
}

