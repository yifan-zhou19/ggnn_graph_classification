package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100000];
		int n;
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String p = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
			*p = new Scanner(System.in).nextLine();
		}
		q = b;
		for (p = a;p < a + n;p++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * s;
			s = p;
			if ((*s >= 65 && *s <= 90) || (*s >= 97 && *s <= 122) || (*s == '_'))
			{
				int w = 0;
				for (s = p.Substring(1); * s != 0;s++)
				{
					if ((*s >= 65 && *s <= 90) || (*s >= 97 && *s <= 122) || (*s == '_') || (*s >= 48 && *s <= 57))
					{
						w = 0;
					}
					else
					{
						w = 1;
						break;
					}
				}
				if (w == 0)
				{
					q = 1;
				}
				else
				{
					q = null;
				}
			}
			else
			{
			q = null;
			}
			q++;
		}
		for (q = b;q < b + n;q++)
		{
			System.out.printf("%d\n", q);
		}
	}
}

