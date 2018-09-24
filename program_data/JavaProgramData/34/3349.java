package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void jiaogu(int);
		int input;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = Integer.parseInt(tempVar);
		}
		jiaogu(input);
		return 0;
	}
	public static void jiaogu(int num)
	{
		if (num == 1)
		{
			System.out.print("End");
		}
		else
		{
			if (num % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",num,num / 2);
				jiaogu(num / 2);
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",num,num * 3 + 1);
				jiaogu(num * 3 + 1);
			}
		}
	}


}

