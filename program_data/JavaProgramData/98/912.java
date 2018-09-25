package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int temp1;
		int temp2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps1;
		temp1 = (int)s;
		for (; * ps; ps++)
		{
			i++;
			if (*ps == ' ')
			{
				if (i > LINELENTH + 1)
				{
					for (ps1 = (String)temp1; ps1 < (String)temp2; ps1++)
					{
						System.out.printf("%c", *ps1);
					}
					i = ((int)ps - temp2) / (Character.SIZE / Byte.SIZE);
					temp1 = temp2 + (Character.SIZE / Byte.SIZE);
					System.out.print("\n");
				}
				else
				{
					temp2 = (int)ps;
				}
			}
		}
		for (ps1 = (String)temp1; * ps1; ps1++)
		{
			System.out.printf("%c", *ps1);
		}
		return 0;
	}
}

