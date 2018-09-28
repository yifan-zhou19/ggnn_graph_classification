package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp;
		char[][] s = new char[1000][1000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			temp = 0;
			p = s[i][0];
			if (*p != '_' && Character.isLetter(*p) == 0)
			{
			System.out.print("0\n");
			}
			else
			{
				for (p = s[i] + 1; * p != '\0';p++)
				{
					if (*p != '_' && Character.isLetter(*p) == 0 && Character.isDigit(*p) == 0)
					{
					temp++;
					}
				}
				if (temp != 0)
				{
				System.out.print("0\n");
				}
				if (temp == 0)
				{
				System.out.print("1\n");
				}

			}
		}
		return 0;
	}
}

