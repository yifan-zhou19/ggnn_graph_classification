package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);

		int i;
		int chang;
		int t;
		int num = 0;
		int sum = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int ji;
		c = new Scanner(System.in).nextLine();
		for (ji = 0;ji < n;ji++)
		{
			c = new Scanner(System.in).nextLine();
			chang = c.length();
			sum = 0;
			for (i = 0;i < chang;i++)
			{
				num = 0;
				for (t = 0;t < chang;t++)
				{
					if (c.charAt(i) == c.charAt(t))
					{
						num++;
					}
				}
				if (num == 1)
				{
						System.out.printf("%c\n",c.charAt(i));
						sum++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto can;
				}

			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	can:
			if (sum == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}


}

