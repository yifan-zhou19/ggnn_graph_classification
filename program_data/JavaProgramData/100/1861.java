package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[305]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int[] sz = new int[26];
		int[] a = new int[26];
		int i;
		int j;
		int c = 1;
		int d = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (ps = zfc; * ps != '\0';ps++)
		{
			for (i = 0;i < 26;i++)
			{
				if (*ps == 65 + i)
				{
					sz[i]++;
					break;
				}
			}
			for (j = 0;j < 26;j++)
			{
				if (*ps == 97 + j)
				{
					a[j]++;
					break;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sz[i] != 0)
			{
				break;
			}
			else
			{
				c = 0;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (a[j] != 0)
			{
				break;
			}
			else
			{
				d = 0;
			}
		}
		if (c == 0 && d == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (sz[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 65,sz[i]);
				}
			}
			for (j = 0;j < 26;j++)
			{
				if (a[j] != 0)
				{
					System.out.printf("%c=%d\n",j + 97,a[j]);
				}
			}
		}
		return 0;
	}




}

