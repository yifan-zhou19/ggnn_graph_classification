package <missing>;

public class GlobalMembers
{
	// 1011171.cpp : Defines the entry point for the console application.
	//

	public static void Main(String[] args)

	{
		String string = new String(new char[100000]);
		int i;
		int j;
		int k;
		int flag;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= t;k++)
		{
			String = new Scanner(System.in).nextLine();
		for (i = 0;string.charAt(i) != '\0';i++)

		{
			flag = 1;
			for (j = 0;string.charAt(j) != '\0';j++)
			{
				if (i != j)
				{
					if (String[i] == string.charAt(j))
					{
						flag = 0;
						break;
					}
				}
			}
			if (flag != 0)
			{
			  System.out.printf("%c\n",string.charAt(i));
			  break;
			}
		}

		if (flag == 0)
		{
			System.out.print("no\n");
		}
		}
	}

}

