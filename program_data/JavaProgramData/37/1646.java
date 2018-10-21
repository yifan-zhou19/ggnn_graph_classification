package <missing>;

public class GlobalMembers
{
	public static String x = new String(new char[100000]);
	public static String y = new String(new char[100000]);
	public static String range = new String(new char[100000]);
	public static String flag = new String(new char[100000]);
	public static int[] time = new int[100000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k = 0;
		while (k < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			int len = x.length();
			y = x;
			char t;
			for (i = 0;i < len - 1;i++)
			{
				for (j = 0;j < len - 1 - i;j++)
				{
					if (y.charAt(j) > y.charAt(j + 1))
					{
						t = y.charAt(j);
						y = tangible.StringFunctions.changeCharacter(y, j, y.charAt(j + 1));
						y = tangible.StringFunctions.changeCharacter(y, j + 1, t);
					}
				}
			}
			for (i = 0;i < 100000;i++)
			{
				time[i] = 1;
			}
			flag = tangible.StringFunctions.changeCharacter(flag, 0, y.charAt(0));
			int p = 0;
			for (i = 0;i < len - 1;i++)
			{
				if (y.charAt(i) == y.charAt(i + 1))
				{
					time[p]++;
				}
				else
				{
					flag = tangible.StringFunctions.changeCharacter(flag, ++p, y.charAt(i + 1));
				}
			}
			int m = 0;
			int biaoji = 0;
			for (i = 0;i <= p;i++)
			{
				if (time[i] == 1)
				{
					range = tangible.StringFunctions.changeCharacter(range, m++, flag.charAt(i));
					biaoji = 1;
				}
			}
			int ting = 0;
			if (biaoji == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				for (i = 0;i < len;i++)
				{
					for (j = 0;j < m;j++)
					{
						if (x.charAt(i) == range.charAt(j))
						{
							System.out.printf("%c\n",x.charAt(i));
							ting = 1;
							break;
						}
					}
					if (ting == 1)
					{
						break;
					}
				}
			}
			k++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(y,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(range,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

