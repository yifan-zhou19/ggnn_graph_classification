public class book
{
	public int id;
	public String p = new String(new char[26]);
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
		int[] a = new int[150];
		int flag;
		int max = 0;
		book t = new book();
		book[] s;
		book[] o = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		book[] y = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = tangible.Arrays.initializeWithDefaultbookInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].p = tempVar3.charAt(0);
			}
		  for (j = 0;s[i].p.charAt(j) != '\0';j++)
		  {
			  a[s[i].p.charAt(j)]++;
		  }
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (max < a[i])
			{
			max = a[i];
			j = i;
			}
		}
		System.out.printf("%c\n",j);
	System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (k = 0;s[i].p.charAt(k) != '\0';k++)
			{
				if (s[i].p.charAt(k) == j)
				{
					flag = 1;
				}
			}
				if (flag == 1)
				{
					System.out.printf("%d\n",s[i].id);
				}
		}
	}
}

