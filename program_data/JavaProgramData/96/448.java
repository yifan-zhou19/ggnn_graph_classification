package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int k;
		  int l;
		  int[] a = new int[100];
		  String s = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  n = 0;
		  while (s.charAt(n) != '\0')
		  {
			  n++;
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
			  a[i] = s.charAt(i) - '0';
		  }
		  for (i = 0;i <= n - 2;i++)
		  {
				  a[i + 1] = a[i + 1] + (a[i] % 13) * 10;
				  a[i] = a[i] / 13;
		  }
		  k = a[n - 1] % 13;
		  a[n - 1] = a[n - 1] / 13;
		  l = 0;
		  while ((a[l] == 0) && (l < n - 1))
		  {
			  l++;
		  }
		  for (i = l;i <= n - 1;i++)
		  {
			  System.out.printf("%d",a[i]);
		  }
		  System.out.print("\n");
		  System.out.printf("%d",k);
		  //getchar();
		  //getchar();
	}

}

