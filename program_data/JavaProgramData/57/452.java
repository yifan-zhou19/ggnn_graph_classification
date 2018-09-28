package <missing>;

public class GlobalMembers
{
	public static char[][] eng =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	public static int i;

	public static void Main()
	{
		void change(int i);
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		for (i = 0;i < sum;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				eng[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < sum;i++)
		{
			change(i);
		}
		for (i = 0;i < sum;i++)
		{
			System.out.printf("%s\n",eng[i]);
		}
	}


	public static void change(int i)
	{
		int a;
		a = String.valueOf(eng[i]).length();
		if (eng[i][a - 2] == 'e' || eng[i][a - 2] == 'l')
		{
			eng[i][a - 2] = '\0';
		}
		else if (eng[i][a - 3] == 'i')
		{
			eng[i][a - 3] = '\0';
		}

	}



}

