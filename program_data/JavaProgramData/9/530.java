package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int f;
	  int g;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] p = new int[n];
	  int[] e = new int[n];
	  int[] d = new int[n];
	  char[][] a = new char[n][100];
	  char[][] b = new char[n][100];
	  char[][] c = new char[n][100];
	  String s = new String(new char[100]);
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[i] = Integer.parseInt(tempVar3);
		}
	  }
		  j = 0,k = 0;
	  for (i = 0;i < n;i++)
	  {

		if (p[i] >= 60)
		{
		e[j] = p[i];
		b[j] = a[i];
		j++;
		}
		else
		{
		 c[k] = a[i];
		 k++;
		}
	  }
	  for (f = 0;f < j - 1;f++)
	  {
	   for (g = 0;g < j - 1 - f;g++)
	   {
		 if (e[g] < e[g + 1])
		 {
		  t = e[g + 1];
		  e[g + 1] = e[g];
		  e[g] = t;
		  s = b[g + 1];
		  b[g + 1] = b[g];
		  b[g] = s;
		 }
	   }
	  }
	for (i = 0;i < j;i++)
	{
		System.out.printf("%s\n",b[i]);
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%s\n",c[i]);
	}
	  System.in.read();
	  System.in.read();
	}

}

