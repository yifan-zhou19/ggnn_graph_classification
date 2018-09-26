package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[10000][41];
		(char)(*p)[41] = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(p + i) = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (temp + String.valueOf(*(p + i)).length() <= 80)
			{
				if (temp == 0)
				{
				System.out.printf("%s",*(p + i));
				temp += String.valueOf(*(p + i)).length() + 1;
				}
				else
				{
					System.out.printf(" %s",*(p + i));
					temp += String.valueOf(*(p + i)).length() + 1;
				}
			}
			else
			{
				System.out.print("\n");
				temp = 0;
				i--;
			}
		}
		return 0;
	}

}

