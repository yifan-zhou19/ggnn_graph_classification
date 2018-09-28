package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] x = new char[1000][41];
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = tempVar2.charAt(0);
			}
		}
		x[a][0] = '\0';
		b = String.valueOf(x[0]).length();
		for (i = 0;i < a;i++)
		{
			b += String.valueOf(x[i + 1]).length();
			if (b >= 80)
			{
				System.out.printf("%s\n",x[i]);
				b = String.valueOf(x[i + 1]).length();
			}
			else if (i == a - 1)
			{
				System.out.printf("%s",x[i]);
			}
			else
			{
				System.out.printf("%s ",x[i]);
			b++;
			}

		}


		return 0;
	}
}

