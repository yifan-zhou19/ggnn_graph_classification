package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int count = 0;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
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
		for (i = 0;i < 50;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				j = i;
				for (ps = s; * ps != '\0';ps++,i++)
				{
				   if (*ps != w.charAt(i))
				   {
					   count++;
				   }
				}
				if (count == 0)
				{
					System.out.printf("%d",j);
				}

			}
		}
	}
}

