package <missing>;

public class GlobalMembers
{
	public static int islegal(String seq, int size)
	{
		int i;
		int flag = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr;
		ptr = seq;
		if (*ptr == '_' || Character.isLetter(*ptr) != 0)
		{
			for (i = 1;i < size;i++)
			{
				ptr = ptr + (Character.SIZE / Byte.SIZE);
				if (*ptr != '_' && Character.isLetter(*ptr) == 0 && Character.isDigit(*ptr) == 0)
				{
					flag = 0;
					break;
				}
			}
		}
		else
		{
			flag = 0;
		}
		return flag;
	}

	public static int Main()
	{
		int n;
		int i;
		int len;
		String zfc = new String(new char[80000]);
		zfc = new Scanner(System.in).nextLine();
		n = Integer.parseInt(zfc);
		for (i = 0;i < n;i++)
		{
			zfc = new Scanner(System.in).nextLine();
			len = zfc.length();
			System.out.printf("%d\n",islegal(zfc, len));
		}
		return 0;
	}
}
