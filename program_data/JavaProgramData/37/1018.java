package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int num;
		char[][] s = new char[100][1000];
		String a = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q2;
		a = new Scanner(System.in).nextLine();
		t = Integer.parseInt(a);
		for (p = s;p < *(s + t);p += 1000)
		{
			p = new Scanner(System.in).nextLine();
		}
		for (p = s;p < *(s + t);p += 1000)
		{
			for (q1 = p;q1 < p + p.length();q1++)
			{
				num = 0;
				for (q2 = p;q2 < p + p.length();q2++)
				{
					if (*q1 == *q2)
					{
						num++;
					}
					if (num == 2)
					{
						break;
					}
				}
				if (q2 == p + p.length())
				{
					System.out.printf("%c\n",*q1);
					break;
				}
			}
			if (q1 == p + p.length())
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}
