package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int sum;
		int temp;
		char[][] s = new char[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		}
		for (i = 0;i < t;i++)
		{
			temp = 0;
			for (p = s[i]; * p != '\0';p++)
			{
				sum = 0;
				for (q = s[i]; * q != '\0';q++)
				{
					if (*p == *q)
					{
					sum++;
					}
				}
				if (sum == 1 && temp == 0)
				{
									System.out.printf("%c\n",*p);
									temp++;
				}
			}
			if (temp == 0)
			{
			System.out.print("no\n");
			}
		}
		return 0;
	}

}

