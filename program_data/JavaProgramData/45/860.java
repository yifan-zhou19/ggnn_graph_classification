package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int n;
		int k;
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
		n = a.length();
		k = b.length();
		for (i = 0;i < k;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 1;j < n;j++)
				{
					if (b.charAt(i + j) != a.charAt(j))
					{
						break;
					}
					else
					{
						System.out.printf("%d",i);
					}
						break;
				}
				 break;
			}
		}
	}
}

