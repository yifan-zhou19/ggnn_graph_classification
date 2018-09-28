package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int la;
		int lb;
		la = a.length();
		lb = b.length();
		int i;
		int j;
		int k = 0;
		for (i = 0;i < lb;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				for (j = 1;j < la;j++)
				{
					if (a.charAt(j) != b.charAt(i + j))
					{
						break;
					}
					else
					{
						k++;
					}
				}
				if (k == la - 1)
				{
					System.out.printf("%d\n",i);
				}
			}
		}
	}

}

