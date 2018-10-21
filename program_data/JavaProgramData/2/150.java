public class book
{
	public int id;
	public String zz = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] num = new int[26];
		int maxz;
		int j;
		String string = new String(new char[26]);
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
				b[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].zz = tempVar3.charAt(0);
			}
			for (j = 0;b[i].zz.charAt(j) != '\0';j++)
			{
			num[b[i].zz.charAt(j) - 'A']++;
			}
		}
		int max = 0;
		for (i = 0;i < 26;i++)
		{
		 if (max < num[i])
		 {
		 max = num[i];
		 maxz = i;
		 }
		}
		System.out.printf("%c\n%d",maxz + 65,max);
		for (i = 0;i < m;i++)
		{
		 for (j = 0;b[i].zz.charAt(j) != '\0';j++)
		 {
			  if (b[i].zz.charAt(j) == maxz + 65)
			  {
				  System.out.printf("\n%d", b[i].id);
			  }
			else
			{
				continue;
			}
		 }
		}
	}

}

