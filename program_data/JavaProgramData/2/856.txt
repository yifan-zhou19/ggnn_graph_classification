public class info
{
	public int nam;
	public String aut = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static info[] inf = tangible.Arrays.initializeWithDefaultinfoInstances(1000);
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[26];
		int k;
		int max = 0;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
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
				inf[i].nam = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				inf[i].aut = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			p = inf[i].aut;
			while (*p != '\0')
			{
				a[*p - 65]++;
				p++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			max = max > a[i] != 0?max:a[i];
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%c\n",i + 65);
				break;
			}
		}
		k = i + 65;
		for (i = 0;i < n;i++)
		{
			p = inf[i].aut;
			while (*p != '\0')
			{
				if (*p == k)
				{
					sum++;
					break;
				}
				p++;
			}
		}
		System.out.printf("%d\n",sum);
		for (i = 0;i < n;i++)
		{
			p = inf[i].aut;
			while (*p != '\0')
			{
				if (*p == k)
				{
					System.out.printf("%d\n",inf[i].nam);
					break;
				}
			p++;
			}
		}
	}

}

