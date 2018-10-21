public class book
{
	   public int num;
	   public String aut = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
		   public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(200000);
	public static int[] count = new int[1000];

	public static int Main()
	{
		int n;
		int max = 0;
		int maxnum;
		int i;
		int j;
		int f;
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
							  b[i].num = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b[i].aut = tempVar3.charAt(0);
						  }
						  for (j = 0;j < String.valueOf(b[i].aut).length();j++)
						  {
							  count[b[i].aut.charAt(j)]++;
						  }
		}
		for (i = 'A';i <= 'Z';i++)
		{
							 if (count[i] > max)
							 {
											  max = count[i];
											  maxnum = i;
							 }
		}
		System.out.printf("%c\n%d\n", maxnum, max);
		for (i = 1;i <= n;i++)
		{
						  f = 0;
						  for (j = 0;j < String.valueOf(b[i].aut).length();j++)
						  {
														  if (b[i].aut.charAt(j) == maxnum)
														  {
															  f = 1;
														  }
						  }
						  if (f == 1)
						  {
							  System.out.printf("%d\n", b[i].num);
						  }
		}

		return 0;
	}


}

