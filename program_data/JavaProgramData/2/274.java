public class book
{
	public int num;
	public String name = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		book[] c = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		int i;
		int j;
		int n;
		int k;
		int max;
		int l;
		int[] d = new int[26];
		int a;
		int[] b = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c[k].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[k].name = tempVar3.charAt(0);
		}
		for (i = 0;i < String.valueOf(c[k].name).length();i++)
		{
			for (j = 0;j < 26;j++)
			{
				if ('A' + j == c[k].name.charAt(i))
				{
					break;
				}
			}
			b[j] = b[j] + 1;
		}
		}
		for (a = 0;a < 26;a++)
		{
			d[a] = b[a];
		}
		 max = b[0];
		 for (l = 0;l < 26;l++)
		 {
		 if (b[l] > max)
		 {
			 max = b[l];
		 }
		 }
		  for (a = 0;a < 26;a++)
		  {
			if (d[a] == max)
			{
				break;
			}
		  }
		System.out.printf("%c\n",'A' + a);
		 System.out.printf("%d\n",max);

		 for (k = 0;k < n;k++)
		 {
			for (i = 0;i < String.valueOf(c[k].name).length();i++)
			{
				if ('A' + a == c[k].name.charAt(i))
				{
					System.out.printf("%d\n",c[k].num);
					break;
				}
			}
		 }
	}
}

