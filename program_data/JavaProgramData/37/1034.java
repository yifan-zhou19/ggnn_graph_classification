package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int len;
		int m;
		int[] letter = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pl;
		String zfc = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (pl = letter;pl < letter + 26;pl++)
			{
				*pl = 0;
			}
			pl = letter;

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			len = zfc.length();
			for (p = zfc;p < zfc.Substring(len);p++)
			{
				*(pl + *p - 97) += 1;
			}

			m = 0;
			for (p = zfc;p < zfc.Substring(len);p++)
			{
				if (*(pl + *p - 97) == 1)
				{
					System.out.printf("%c\n",*p);
					m = 1;
					break;
				}
			}

			if (m == 0)
			{
				System.out.print("no\n");
			}
		}

	}
}

