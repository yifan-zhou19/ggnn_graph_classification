package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int a;
		int b;
		int i;
		int j;
		int[] c = new int[20];
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		a = str1.length();
		b = str2.length();
	p = str2;
		if (a == b)
		{
			{
				for (i = 0;i < a;i++)
				{
			c[i] = 0;
			for (p = str2;p < a + str2;p++)
			{
			if (str1.charAt(i) == *p)
			{
				c[i] = 1;
				continue;
			}
			}
				}
		}
	for (i = 0;i < a;i++)
	{
			if (c[i] == 0)
			{
		d = 1;
		break;
			}
	}
	if (d == 1)
	{
		System.out.print("NO");
	}
	else
	{
	System.out.print("YES");
	}
		}
		else
		{
			System.out.print("NO");
		}
	}

}

