//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int num;
	public String au = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] book = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(999);


	public static int Main()
	{
		int m;
		int[] a = new int[26];
		int i;
		int j;
		int t;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].au = tempVar3.charAt(0);
			}
			int au_n = String.valueOf(book[i].au).length();
			for (j = 0;j < au_n;j++)
			{
				if (book[i].au.charAt(j) <= 90 && book[i].au.charAt(j) >= 65)
				{
					int k = book[i].au.charAt(j) - 65;
					a[k]++;
					if (a[k] > max)
					{
						max = a[k];
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] == max)
			{
				char r = i + 65;
				System.out.printf("%c\n%d\n",r,max);
				break;
			}
		}
		for (t = 0;t < m;t++)
		{
			int au_n = String.valueOf(book[t].au).length();
			for (j = 0;j < au_n;j++)
			{
				if (book[t].au.charAt(j) == i + 65)
				{
					System.out.printf("%d\n",book[t].num);
				}
			}
		}
		return 0;
	}
}

