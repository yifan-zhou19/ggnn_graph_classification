public class book
{
	public int num;
	public String name = new String(new char[26]);
}
public class name
{
	public char na;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int max = 0;
		book[] a = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		name[] b = tangible.Arrays.initializeWithDefaultnameInstances(26);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i <= 25;i++)
		{
			b[i].na = 'A' + i;
			for (j = 0,s = 0;j <= n - 1;j++)
			{
				for (k = 0;k <= String.valueOf(a[j].name).length() - 1;k++)
				{
					if (b[i].na == a[j].name.charAt(k))
					{
						s++;
						break;
					}
				}
			}
			b[i].n = s;
		}
		for (i = 0;i <= 25;i++)
		{
			if (b[i].n > max)
			{
				max = b[i].n;
			}
		}

		for (i = 0;i <= 25;i++)
		{
			if (b[i].n == max)
			{
				System.out.printf("%c\n%d\n",b[i].na,b[i].n);
			for (j = 0;j <= n - 1;j++)
			{
					for (k = 0;k <= String.valueOf(a[j].name).length() - 1;k++)
					{
						if (b[i].na == a[j].name.charAt(k))
						{
							System.out.printf("%d\n",a[j].num);
							break;
						}
					}
			}
			}
		}
	}









}

