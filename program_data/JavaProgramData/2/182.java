public class author
{
	public int num;
	public String aut = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static author[] a = tangible.Arrays.initializeWithDefaultauthorInstances(999);

	public static void Main()
	{
		void search(struct author b[],int n,char marker);
		int m;
		int i;
		int[] times = new int[30];
		int length = 0;
		int j;
		int max = 0;
		int flag = 9;
		char chac;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	//	printf("%d",m);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].aut = tempVar3.charAt(0);
			}
		//	printf("%d %s",a[i].num,a[i].aut);
			length = String.valueOf(a[i].aut).length();
			for (j = 0;j < length;j++)
			{
				chac = a[i].aut.charAt(j);
				times[chac - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < times[i])
			{
				max = times[i];
				flag = i;
			}
		}
		System.out.printf("%c\n%d\n",(char)(flag + 'A'),max);
		search(a, m, (char)(flag + 'A'));
	}

	public static void search(author[] b, int n, char marker)
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(b[i].aut).length();j++)
			{
				if (b[i].aut.charAt(j) == marker)
				{
					System.out.printf("%d\n",b[i].num);
				}
			}
		}
	}

}

