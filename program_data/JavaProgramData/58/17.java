package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag;
		String str = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		i = 0;
		while (i < n)
		{
			str = new Scanner(System.in).nextLine();
			p = str;
			flag = 0;
			if (((*p >= 65) && (*p <= 90)) || ((*p >= 97) && (*p <= 122)) || (*p == '_'))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
			p++;
			while ((*p != '\0') && (flag == 1))
			{
				if (((*p >= 48) && (*p <= 57)) || ((*p >= 65) && (*p <= 90)) || ((*p >= 97) && (*p <= 122)) || (*p == '_'))
				{
					flag = 1;
				}
				else
				{
					flag = 0;
				}
				p++;
			}
			System.out.printf("%d\n",flag);
			i++;

		}
		return (0);
	}





}

