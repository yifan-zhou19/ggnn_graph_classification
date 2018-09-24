package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int n1;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		n = a.length();
		n1 = b.length();
		for (i = 0;i < n1 - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b.charAt(i + j) != a.charAt(j))
				{
					break;
				}
			}
			if (j == n)
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}
}

