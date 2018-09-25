public class book
{
  public int num;
  public String aut = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] bo = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int[] count = new int[26];
	  int max;
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
			bo[i].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			bo[i].aut = tempVar3.charAt(0);
		}
	  }
	  for (i = 0;i < 26;i++)
	  {
		count[i] = 0;
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < 26;j++)
		{
			if (bo[i].aut.charAt(j) - 65 >= 0 && bo[i].aut.charAt(j) - 65 < 26)
			{
			  count[bo[i].aut.charAt(j) - 65]++;
			}
		}
	  }
	  max = 0;
	  for (i = 0;i < 26;i++)
	  {
		if (count[i] > max)
		{
			  max = count[i];
			  k = i;
		}
	  }
	  System.out.printf("%c\n%d\n",k + 65,max);
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < 26;j++)
		{
			if (bo[i].aut.charAt(j) - 65 == k)
			{
			  System.out.printf("%d\n",bo[i].num);
			}
		}
	  }
	}
}

