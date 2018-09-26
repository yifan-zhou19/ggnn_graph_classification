package <missing>;

public class GlobalMembers
{
	public static int judge(String front, int m)
	{
		int i;
		int out;
		final String back = "";
		for (i = 0;i < m;i++)
		{
			back = tangible.StringFunctions.changeCharacter(back, i, front[m - i - 1]);
		}
		if (strcmp(back,front) == 0)
		{
			out = 1;
		}
		else
		{
			out = 0;
		}
		return out;
	}

	public static int Main()
	{
		int len;
		int i;
		int j;
		int k;
		String s = new String(new char[MAX]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 2;i <= len;i++)
		{
			String[] son = {""};
			for (j = 0;j <= len - i;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				char * p = s.charAt(j);
				for (k = 0;k < i;k++)
				{
					son[j][k] = p;
					p++;
				}
			}
			for (j = 0;j <= len - 1;j++)
			{
				int out;
				out = judge(son[j], i);
				if (out == 1)
				{
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",son[j][k]);
					}
					System.out.print("\n");
				}

			}
		}
		return 0;
	}





}

