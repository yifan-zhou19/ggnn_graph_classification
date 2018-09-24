package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int length;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String str = new String(new char[50]);
			char[] daoz = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			length = str.length();
			for (i = length - 1,j = 0;i >= length - 2;i--,j++)
			{
				daoz[j] = str.charAt(i);

			}

			if (strcmp(daoz,"re") == 0)
			{
				for (i = 0;i <= length - 3;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print("\n");
			}
			if (strcmp(daoz,"yl") == 0)
			{
				for (i = 0;i <= length - 3;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print("\n");
			}
			for (i = length - 1,j = 0;i >= length - 3;i--,j++)
			{
				daoz[j] = str.charAt(i);

			}

			if (strcmp(daoz,"gni") == 0)
			{
				for (i = 0;i <= length - 4;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print("\n");
			}

		}
	}



}

