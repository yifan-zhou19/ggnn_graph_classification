public class person
{
	public int num;
	public int[] book = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static person[] p = tangible.Arrays.initializeWithDefaultpersonInstances(26);
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int k;
	public static String str = new String(new char[30]);
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(p,0,sizeof(p));
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str = tempVar3.charAt(0);
			}
			for (j = str.length() - 1;j >= 0;j--)
			{
				if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z')
				{
					k = p[str.charAt(j) - 'A'].num++;
					p[str.charAt(j) - 'A'].book[k] = m;
				}
			}
		}
		m = 0;
		for (i = 1;i < 26;i++)
		{
			if (p[i].num > p[m].num)
			{
				m = i;
			}
		}
		System.out.printf("%c\n",'A' + m);
		System.out.printf("%d\n",p[m].num);
		for (i = 0;i < p[m].num;i++)
		{
			System.out.printf("%d\n",p[m].book[i]);
		}
		return 0;
	}

}

