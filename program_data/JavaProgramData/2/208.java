public class information
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static information[] a;
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] s = new int[26];
		int max = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = tangible.Arrays.initializeWithDefaultinformationInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].author = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i].author.charAt(j) != '\0';j++)
			{
				m = a[i].author.charAt(j) - 'A';
				s[m]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < s[i])
			{
				max = s[i];
				p = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + p,s[p]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a[i].author.charAt(j) == 'A' + p)
				{
					System.out.printf("%d\n",a[i].num);
					break;
				}
			}
		}
	}
}

