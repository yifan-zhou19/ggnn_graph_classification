package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int wlong;
		String word = new String(new char[32]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			for (p = word; * p; p++)
			{
				;
			}
			switch (*(p - 1))
			{
			case 'r' :
				wlong = 2;
				break;
			case 'y' :
				wlong = 2;
				break;
			case 'g' :
				wlong = 3;
				break;
			}
			*(p - wlong) = '\0';
			System.out.printf("%s\n", word);
		}
	}
}

