public class stu
{
	public int id;
	public String author = new String(new char[26]);
	public int length;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int k;
		int num = 0;
		int max = 0;
		char b;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].author = tempVar3.charAt(0);
			}
			a[i].length = String.valueOf(a[i].author).length();
		}
		for (b = 'A';b <= 'Z';b++)
		{
			num = 0;
			for (i = 0;i < n;i++)
			{
				for (k = 0;k < a[i].length;k++)
				{
					if (a[i].author.charAt(k) == b)
					{
						num++;
						break;
					}
				}
			}
			if (num > max)
			{
				max = num;
				c = b;
			}
		}
		System.out.printf("%c\n%d\n",c,max);
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < a[i].length;k++)
			{
				if (a[i].author.charAt(k) == c)
				{
						System.out.printf("%d\n",a[i].id);
						break;
				}
			}
		}
		return 0;
	}
}

