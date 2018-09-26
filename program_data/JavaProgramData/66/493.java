package <missing>;

public class GlobalMembers
{
	public static int runnian(int x)
	{
		int mark = 1;
		if (x % 100 != 0 && x % 4 == 0 || x % 400 == 0)
		{
			mark = 0;
		}
		return (mark);
	}
	public static int Main()
	{
		int n;
		int b;
		int c;
		int[] a = {1, 31, 1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int num = 0;
		int day;
		int i;
		num = (n - 1) % 7 + (n - 1) / 4 - (n - 1) / 100 + (n - 1) / 400;
		if (runnian(n) == 0)
		{
			a[2] = 29;
		}
		else if (runnian(n) != 0)
		{
			a[2] = 28;
		}
		for (i = 1;i < b;i++)
		{
			num += a[i];
		}
		num += c;
		day = (num - 1) % 7 + 1;
		if (day == 1)
		{
			System.out.print("Mon.\n");
		}
			else if (day == 2)
			{
				  System.out.print("Tue.\n");
			}

			else if (day == 3)
			{
					System.out.print("Wen.\n");
			}
			else if (day == 4)
			{
					System.out.print("Thu.\n");
			}
			else if (day == 5)
			{
			   System.out.print("Fri.\n");
			}
			else if (day == 6)
			{
					System.out.print("Sat.\n");
			}
			 else if (day == 7)
			 {
				System.out.print("Sun.\n");
			 }
		return 0;
	}

}

