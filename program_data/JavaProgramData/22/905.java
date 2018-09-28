package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int max1 = 0;
		int max2 = 0;
		int a;
		int count = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a > max1)
			{
				max2 = max1;
				max1 = a;
			}
			else if (a < max1 && a> max2)
			{
				max2 = a;
			}
			count++;
		} while (System.in.read() != '\n');
		if (max2 == 0 || count == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",max2);
		}
		return 0;
	}
}

