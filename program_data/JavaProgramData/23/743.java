package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[80][20];
		String[] p = new String[80];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		String * q;
		char t;
		int i;
		for (i = 0;i < 80;i++)
		{
			p[i] = a[i];
		}
		for (q = p;;q++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				*q = tempVar.charAt(0);
			}
			t = System.in.read();
			if (t != ' ')
			{
				break;
			}
		}
		for (;q > p;q--)
		{
			System.out.printf("%s ",*q);
		}
		System.out.printf("%s",*q);
	}
}

