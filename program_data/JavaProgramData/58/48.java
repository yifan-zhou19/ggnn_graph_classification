package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			g = Integer.parseInt(tempVar);
		}
		while (g-- != 0)
		{
			int flag = 0;
			a = new Scanner(System.in).nextLine();
			if (*a == '\0')
			{
				 g++;
				 continue;
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = a;
			for (p = a;p < a + a.length();p++)
			{
				 if ((!Character.isLetter(*p)) && (!Character.isDigit(*p)) && (*p != '_'))
				 {
					   flag = 1;
					   System.out.print("0\n");
					   break;
				 }
			}
			if (flag == 1)
			{
				 continue;
			}
			if (*a == '_' || Character.isLetter(*a))
			{
				 System.out.print("1\n");
			}
			else
			{
				 System.out.print("0\n");
			}
		}
	}



}

