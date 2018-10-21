package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		char i;
		int k = 0;
		int j;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 'a';i <= 'z';i++)
		{
			num = 0;
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if (s.charAt(j) == i)
				{
					num++;
				}
			}
			if (num != 0)
			{
				System.out.printf("%c=%d\n",i,num);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
	}

}

