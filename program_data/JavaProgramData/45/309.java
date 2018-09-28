package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int S;
		int W;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		S = s.length();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			W = 1;
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = 1;s.charAt(j) != '\0';j++)
				{
					if (w.charAt(i + j) != s.charAt(j))
					{
						break;
					}
													else
													{
														W++;
													}
				}
			}
			if (W == S)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}
}

