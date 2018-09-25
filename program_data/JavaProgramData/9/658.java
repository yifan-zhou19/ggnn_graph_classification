package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int[] a = new int[1000];
		  int[] e = new int[1000];
		  int t;
		  int b;
		  int k;
		  int j;
		  int d;
		  char[][] str = new char[1000][1000];
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
			  str[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  b = 0;
		  for (i = 1;i <= n;i++)
		  {
		  if (a[i] >= 60)
		  {
			  b++;
		  }
		  }
		  t = b;
		  for (i = 1;i <= n;i++)
		  {
		  if (a[i] < 60)
		  {
			  b++;
		  e[b] = i;
		  }
		  }
		  k = 0;
		  for (j = 100;j >= 60;j--)
		  {
		  for (i = 1;i <= n;i++)
		  {
		  if (a[i] == j)
		  {
			  k++;
		  e[k] = i;
		  }
		  }
		  }
		  for (i = 1;i <= n;i++)
		  {
			  j = e[i];
		  if (i == 1)
		  {
		  System.out.printf("%s",str[j]);
		  }
		  else
		  {
		  System.out.printf("\n%s",str[j]);
		  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

