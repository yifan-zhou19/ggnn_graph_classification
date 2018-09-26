package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String letter1 = new String(new char[100]);
		String letter2 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * le1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * le2;
		le1 = letter1;
		le2 = letter2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			le1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			le2 = tempVar2.charAt(0);
		}
		int _break;
		if (letter1.length() == letter2.length())
		{
			for (; * le1 != '\0';le1++)
			{
				le2 = letter2;
				_break = 0;
				for (; * le2 != '\0';le2++)
				{
					if (*le1 == *le2)
					{
						*le2 = '0';
						_break = 1;
						break;
					}
				}
				if (_break == 0)
				{
					System.out.print("NO\n");
					_break = 2;
					break;
				}
			}
			if (_break != 2)
			{
				System.out.print("YES\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}

}

