package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[60];
		String a = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (; * p != '\0';p++)
		{
			for (int o = 65;o <= 90;o++)
			{
				if (*p == o)
				{
					b[o - 65]++;
				}
			}
			for (int q = 97;q <= 122;q++)
			{
				if (*p == q)
				{
					b[q - 71]++;
				}
			}
		}
		int i;
		int n = 0;
		final String g = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		s = g;
		for (i = 0;i < 52;i++,s++)
		{
			char v;
			v = s;
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",v,b[i]);
				n++;
			}

		}
		if (n == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}



}

