package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int suffixLen;
		String word = new String(new char[32]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
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
			case 'r':
				*(p - 2) = '\0';
				;
				break;
			case 'y':
				*(p - 2) = '\0';
				;
				break;
			case 'g':
				*(p - 3) = '\0';
				;
				break;
			}


			System.out.printf("%s\n", word);
		}
		return 0;
	}
}

