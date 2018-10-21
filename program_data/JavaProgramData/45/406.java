package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		int i;
		int k = -1;
		int n;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String p3;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		p1 = c;
		for (i = 0;i < n;i++,p1++)
		{
			if (c.charAt(i) == ' ')
			{
				q = p1;
				break;
			}
		}
		p1 = c;
		p2 = q.Substring(1);
		for (; p2 != '\0';p2++)
		{
			k++;
		if (p2 == *p1)
		{
				for (p3 = p2;p1 < q;p1++,p3++)
				{
				if (*p1 != p3)
				{
					p1 = c;
					break;
				}
				else if (p1 == q - 1)
				{
				System.out.printf("%d\n",k);
				}
				}
		}

		}
	}

}
