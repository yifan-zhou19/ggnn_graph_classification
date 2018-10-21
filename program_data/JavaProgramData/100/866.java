package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int num = 0;
		int l;
		int i;
		int j;
		int[] count = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				num++;
				count[i] = 1;
				for (j = i + 1;j < l;j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						count[i]++,a[j] = '0';
					}
				}
			}
		}
		for (i = 97;i <= 122;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (i == a.charAt(j))
				{
					System.out.printf("%c=%d\n",a.charAt(j),count[j]);
				}
			}
		}
		if (num == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

