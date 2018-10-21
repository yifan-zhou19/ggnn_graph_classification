package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (k = 2;k <= i / 2;)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				loop:
				for (t = 2;t <= Math.sqrt(k);t++)
				{
					if (k % t == 0)
					{
						k++;
						t = 2;
					}
				}
				s = i - k;
				for (t = 2;t <= Math.sqrt(s);t++)
				{
					if (s % t == 0)
					{
						k++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
				System.out.printf("%ld=%ld+%ld\n",i,k,s);
				break;
			}
		}
	}

}

