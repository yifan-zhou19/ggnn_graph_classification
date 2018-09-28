package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int j;
		  int i;
		  int age;
		  int m;
		  int y;
		  int[] b = new int[1000];
		  char[][] B = new char[1000][100];
		  char[][] C = new char[1000][100];
		  char[][] d = new char[1000][100];
		  String a = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  y = 0;
		  k = 0;
		  for (i = 0;i <= n - 1;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  age = Integer.parseInt(tempVar3);
		  }
		  if (age < 60)
		  {
			  B[y] = a;
			  y++;
		  }
		  else
		  {
			  C[k] = a;
			  b[k] = age;
			  k++;

		  }
		  }
		int x = 0;
		for (i = 200;i >= 60;i--)
		{
							for (j = 0;j <= k - 1;j++)
							{
											   if (i == b[j])
											   {
													   d[x] = C[j];
													   x++;
											   }
							}

		}


		for (i = 0;i <= k - 1;i++)
		{
		System.out.println(d[i]);
		}
		for (i = 0;i <= n - k - 1;i++)
		{
		System.out.println(B[i]);
		}


		System.in.read();
		System.in.read();





	}


}

