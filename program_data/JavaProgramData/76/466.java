package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5001];
		int[] b = new int[5001];
		int[] c = new int[5001];
		int i;
		int j;
		int m;
	  m = 0;
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
			  (a[i]) = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (b[i]) = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 1;i < n;i++)
	  {
		  for (j = 0;j < n - i;j++)
		  {
			  if (a[j] > a[j + 1])
			  {
				  int e;
				  e = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = e;
				  e = b[j];
				  b[j] = b[j + 1];
				  b[j + 1] = e;
			  }
		  }
	  }

	  //???c[]??????????????????????????, c[i]????i???????(??0--??i-1)?????????
	  c[1] = b[0];
	  for (i = 2; i < n; i++)
	  {
		  if (b[i - 1] > c[i - 1])
		  {
			  c[i] = b[i - 1];
		  }
		  else
		  {
			  c[i] = c[i - 1];
		  }
	  }

	  for (i = 1; i < n; i++)
	  {
		  if (a[i] > c[i])
		  {
			  m++;
		  }
	  }
	  if (m == 0)
	  {
		  if (b[n - 1] > c[n - 1])
		  {
			System.out.printf("%d %d",a[0],b[n - 1]);
		  }
		  else
		  {
			System.out.printf("%d %d",a[0],c[n - 1]);
		  }
	  }
	  else
	  {
		  System.out.print("no");
	  }
	  return 0;
	}
}

