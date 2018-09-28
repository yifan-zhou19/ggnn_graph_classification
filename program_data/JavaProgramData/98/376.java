package <missing>;

public class GlobalMembers
{
	//*****************************
	//*???2011?1?9?         *
	//*??????               *
	//*?????4                *   
	//*****************************
	public static int Main() //???
	{ //?????
		int n = 0;
		String a = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		cin.get(a,10000,'\n');
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		int[] lenth = new int[100];
		int m = 0;
		int flag = 0;
		while (*p != '\0' && flag == 0)
		{
			int i = 0;
			for (i = 0;i < 80;i++)
			{
				p++;
				if (*p == '\0')
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				if (*p != ' ')
				{
					for (; * p != ' ';p--)
					{
						;
					}
				}
				*p = '\0';
			}
			p = a;
			for (int j = 0;j < m;j++)
			{
				for (i = 0;i < lenth[j] + 1;i++)
				{
					p++;
				}
			}
			for (; * p != '\0';p++)
			{
				System.out.print(p);
				lenth[m]++;
			}
				System.out.print("\n");
			m++;
			p++;
		}
		return 0;
	} //?????
}

