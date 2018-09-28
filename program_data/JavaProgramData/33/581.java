package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		char[][] zfc = new char[1000][256];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}

			for (a = zfc[i]; * a != '\0';a++)
			{
				if (*a == 'A')
				{
				 *a = 'T';
				}
				else if (*a == 'T')
				{
								   *a = 'A';
				}
				else if (*a == 'C')
				{
						*a = 'G';
				}
				else if (*a == 'G')
				{
						*a = 'C';
				}

			}
	System.out.printf("%s\n",zfc[i]);


		}
	}


}

