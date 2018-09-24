package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int s = 0;
		String w1 = new String(new char[50]);
		String w2 = new String(new char[50]);
		String p1;
		String p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}
		p1 = w1;
		p2 = w2;
		for (j = 0;;j++)
		{
			for (i = 0; * (p1.Substring(i)) != '\0';i++)
			{
				if (*(p2.Substring(i) + j) != *(p1.Substring(i)))
				{
					s = 0;
					break;
				}
				else
				{
					s = 1;
				}
			}
			if (s == 1)
			{
				System.out.printf("%d",j);
				break;
			}
		if (*(p2.Substring(j)) == '\0')
		{
			System.out.print("0");
			break;
		}
		}

	}


}

