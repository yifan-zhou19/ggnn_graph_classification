package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int n;
		int word;
		int k;
		int i;
		String str = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pnum;
		String pstr;
		str = new Scanner(System.in).nextLine();
		k = str.length();
		pstr = str;
		pnum = num;
		for (i = 0;i < 300;i++)
		{
			*pnum = 0;
			pnum++;
		}
		pnum = num;
		word = 1;
		n = 0;
		for (pstr = str;pstr < str.Substring(k);pstr++)
		{
			if (pstr == ' ')
			{
				if (word == 0)
				{
					word = 1;
					n++;
					pnum++;
				}
			}
			else
			{
				word = 0;
				(*pnum)++;
			}
		}
		for (pnum = num;pnum < num + n;pnum++)
		{
			System.out.printf("%d,",*pnum);
		}
		System.out.printf("%d",*pnum);
	}




}
