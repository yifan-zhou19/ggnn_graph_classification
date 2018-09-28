package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int secmax = -32767;
		int max = -32767;
		int n;
		int i = -1;
		int chg = 0;
		int maxchg = 0;
		char ch;
		do
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n > max)
			{
				secmax = max;
				if (maxchg != 0)
				{
					chg = 1;
				}
				max = n;
				maxchg = 1;
			}
			else if (n > secmax && n != max)
			{
				secmax = n;
				chg = 1;
			}
			ch = System.in.read();
		}while (ch == ',');
		if (i < 2 || chg == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",secmax);
		}
	}
}

