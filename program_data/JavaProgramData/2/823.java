public class Bo
{
	public int num;
	public String auth = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static Bo[] a = tangible.Arrays.initializeWithDefaultBoInstances(1010);


	public static void Main()
	{
		int n;
		int i;
		int j;
		int maxnum = 0;
		int max;
		int[] zuozhe = new int[26];
		char out;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].auth = tempVar3.charAt(0);
			}
			for (j = 0;j <= String.valueOf(a[i].auth).length() - 1;j++)
			{
				zuozhe[a[i].auth.charAt(j) - 'A'] = zuozhe[a[i].auth.charAt(j) - 'A'] + 1;
			}
		}
		for (i = 1;i <= 25;i++)
		{
			if (zuozhe[i] > zuozhe[maxnum])
			{
				maxnum = i;
			}
		}
		out = 'A' + maxnum;
		System.out.printf("%c\n",out);
		System.out.printf("%d\n",zuozhe[maxnum]);

		for (i = 1;i <= n;i++)
		{
			if (tangible.StringFunctions.strChr(a[i].auth,out) != null)
			{
				System.out.printf("%d\n",a[i].num);
			}
		}
	}






}

