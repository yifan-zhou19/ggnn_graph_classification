package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static String str = new String(new char[21]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * q;
	public static int Main()
	{
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
				str = tempVar2.charAt(0);
			}
			q = str;
			if ((*q != 95) && ((*q < 65) || (*q>90) && (*q < 97) || (*q>122)))
			{
				System.out.print("no\n");
				continue;
			}

			else
			{
			  q++;
			  while (*q != '\0')
			  {
				if ((*q != 95) && ((*q < 48) || (*q>57) && (*q < 65) || (*q>90) && (*q < 97) || (*q>122)))
				{
					System.out.print("no\n");
					break;
				}
				q++;
			  }
			if (*q == '\0')
			{
				System.out.print("yes\n");
			}
			}
		}

	//scanf("%d",&i);
	return 0;
	}

}

