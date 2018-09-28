package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		char a;
		int i;
		int largest = 0;
		int second = 0;
		int n;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a != '\n')
			{
				if (num[i] > largest)
				{
					second = largest;
					largest = num[i];
				}
				else if ((num[i] < largest) && (num[i]> second))
				{
					second = num[i];
				}
			}
			else
			{
				if (num[i] > largest)
				{
					second = largest;
					largest = num[i];
				}
				else if ((num[i] < largest) && (num[i]> second))
				{
					second = num[i];
				}
				n = i;
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("No");
		}
		else
		{
			if (second == 0)
			{
			System.out.print("No");
			}
			else
			{
				System.out.printf("%d",second);
			}
		}
	}
}

