package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int no = 0;
		String zm = new String(new char[300]);
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zm = tempVar.charAt(0);
		}
		n = zm.length();
		for (ch = 'A';ch <= 'Z';ch++)
		{
			int k = 0;
			for (i = 0;i < n;i++)
			{

				if (zm.charAt(i) == ch)
				{

				k++;
				}
			}
			if (k != 0)
			{
			System.out.printf("%c=%d\n",ch,k);
			}
		}
		for (ch = 'a';ch <= 'z';ch++)
		{
			int k = 0;
			for (i = 0;i < n;i++)
			{

				if (zm.charAt(i) == ch)
				{

				k++;
				}
			}
			if (k != 0)
			{
			System.out.printf("%c=%d\n",ch,k);
			no = 1;
			}
		}
		if (no == 0)
		{
			System.out.print("No");
		}
	}
}

