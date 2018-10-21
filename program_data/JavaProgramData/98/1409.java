package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m = 0;
		int t = 0;
		String word = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			t += word.length();
			m++;
			if (m == 1)
			{
				System.out.printf("%s",word);
			}
			else
			{
				if ((t + m - 1) <= 80)
				{
					System.out.print(" ");
					System.out.printf("%s",word);
				}
				else
				{
					System.out.print("\n");
					System.out.printf("%s",word);
					m = 1;
					t = word.length();
				}
			}
		}
	}
}

