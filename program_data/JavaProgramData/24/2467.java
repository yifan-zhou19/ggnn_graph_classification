package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[2000]);
		String max = new String(new char[2000]);
		String min = new String(new char[2000]);
		str = new Scanner(System.in).nextLine();
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pM;
		int mi = str.length() + 1;
		int ma = 0;
		p = str;
		pM = str;
		for (;;pM++)
		{
			if (*pM == ' ' || *pM == ',')
			{
				*pM = '\0';
				if (pM - p != 0)
				{
					if (pM - p > ma)
					{
						max = p;
						ma = pM - p;
					}
					if (pM - p < mi)
					{
						min = p;
						mi = pM - p;
					}
				}
				p = pM + 1;
			}
			else if (*pM == '\0')
			{
				if (pM - p != 0)
				{
					if (pM - p > ma)
					{
						max = p;
						ma = pM - p;
					}
					if (pM - p < mi)
					{
						min = p;
						mi = pM - p;
					}
				}
				break;
			}
		}
		System.out.println(max);
		System.out.println(min);
		return 0;
	}
}
