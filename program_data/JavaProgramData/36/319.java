package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'i', so pointers on this parameter are left unchanged:
	public static void rank(char * i)
	{
		for (; * i != '\0';i++)
		{
			int n;
			int k = 0;
			char t;
			for (n = 1; * (i.Substring(n)) != '\0';n++)
			{
				if (*(i.Substring(k)) > *(i.Substring(n)))
				{
					k = n;
				}
			}
			if (k != 0)
			{
				t = i;
				*i = (i.Substring(k));
				*(i.Substring(k)) = t;
			}
		}
	}

	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		i = a.charAt(0);
		j = b.charAt(0);
		rank(i);
		rank(j);
		for (i = a.charAt(0), j = b.charAt(0); * i != '\0';i++, j++)
		{
			if (*i != *j)
			{
				System.out.print("NO");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("YES");
		}
	}
}

