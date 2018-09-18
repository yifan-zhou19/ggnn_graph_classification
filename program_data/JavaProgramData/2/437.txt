public class list
{
	   public int book;
	   public String name = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[26];
	  list[] shelf = tangible.Arrays.initializeWithDefaultlistInstances(n);
	  for (i = 0;i <= 25;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  shelf[i].book = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  shelf[i].name = tempVar3.charAt(0);
		  }
		  for (j = 0;j <= String.valueOf(shelf[i].name).length() - 1;j++)
		  {
			  a[shelf[i].name.charAt(j) - 'A']++;
		  }
	  }
	  int max;
	  int flag = 0;
	  int add = 0;
	  int temp = 0;
	  max = a[0];
	  for (i = 0;i <= 25;i++)
	  {
		  if (max < a[i])
		  {
			  max = a[i];
			  flag = i;
		  }
	  }
	  System.out.printf("%c\n",flag + 'A');
	  System.out.printf("%d\n",max);
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = 0;j <= String.valueOf(shelf[i].name).length() - 1;j++)
		  {
			  if (shelf[i].name.charAt(j) == flag + 'A')
			  {
			  add++;
			  }
		  }
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = 0;j <= String.valueOf(shelf[i].name).length() - 1;j++)
		  {
			  if (shelf[i].name.charAt(j) == flag + 'A')
			  {
				  System.out.printf("%d",shelf[i].book);
			  temp++;
			  (temp < add)?System.out.print("\n"):printf("");
			  break;
			  }
		  }
	  }
	}

}

