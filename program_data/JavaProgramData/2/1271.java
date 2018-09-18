public class book
{
	public String name = new String(new char[26]);
public int number;
}

package <missing>;

public class GlobalMembers
{
	public static book[] a = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] b = new int[26];
		int max = 0;
		int t;
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
				a[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i].name.charAt(j) != '\0';j++)
			{
				b[a[i].name.charAt(j) - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max == b[i])
			{
				t = i;
		break;
			}
		}
			System.out.printf("%c\n%d\n",t + 65,b[t]);
			for (i = 0;i < n;i++)
			{
			for (j = 0;a[i].name.charAt(j) != '\0';j++)
			{
			if (a[i].name.charAt(j) == t + 65)
			{
				System.out.printf("%d\n",a[i].number);
			break;
			}
			}
			}
	}


}

