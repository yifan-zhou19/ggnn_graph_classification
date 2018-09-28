package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int time;
		int flag = 0;
		int i;
		int j;
		String a = new String(new char[100000]);
		char first = 0;
		void yesorno(int Flag,char First);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }

		for (time = 0;time < t;time++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a.charAt(1) == '\0')
			{
				System.out.printf("%c\n",a.charAt(0));
				continue;
			}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (i == j)
					{
						continue;
					}
					if (a.charAt(j) == a.charAt(i))
					{
						break;
					}
					if (a.charAt(j + 1) == '\0')
					{
						first = a.charAt(i);
						flag = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto print;
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	print:
	;
			yesorno(flag, first);
			first = flag = 0;
		}
	}
	public static void yesorno(int Flag,char First)
	{
		if (Flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%c\n",First);
		}
	}

}

