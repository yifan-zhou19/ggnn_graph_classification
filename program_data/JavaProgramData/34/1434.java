package <missing>;

public class GlobalMembers
{
	public static void jiaogu(int i)
	{
		if (i == 1)
		{
			System.out.print("End");
		}
		else
		{
			if (i % 2 != 0)
			{
				System.out.printf("%d*3+1=%d\n",i,i * 3 + 1);
				jiaogu(i * 3 + 1);
			}
			else
			{
				System.out.printf("%d/2=%d\n",i,i / 2);
				jiaogu(i / 2);
			}
		}
	}
	public static int Main()
	{
		int n;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		jiaogu(n);
	}

}

