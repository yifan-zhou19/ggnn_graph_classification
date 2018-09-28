package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n1 = a.length();
		n2 = b.length();
		for (i = 0;i < n2;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < n1;j++)
				{
					if (b.charAt(i + j) != a.charAt(j))
					{
						break;
					}
				}
				if (j == n1 && b.charAt(i + j - 1) == a.charAt(j - 1))
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}

	}

}

