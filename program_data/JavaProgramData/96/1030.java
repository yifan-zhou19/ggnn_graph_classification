package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[110];
		  int[] b = new int[110];
		  int i;
		  int j;
		  int m;
		  int yu;
		  int z;
		  int qishi;
		  String c = new String(new char[110]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }

		  for (i = 0;c.charAt(i) != '\0';i++)
		  {
				  a[i + 1] = c.charAt(i) - '0';
		  }
		  m = i;

	if (m == 1)
	{
	System.out.printf("0\n%d",a[1]);
	}
	else
	{
		 if (m == 2)
		 {
		 System.out.printf("%d\n%d",(10 * a[1] + a[2]) / 13, (10 * a[1] + a[2]) % 13);
		 }
		 else
		 {



		  for (i = 1;i <= m - 1;i++)
		  {
				z = 10 * a[i] + a[i + 1];
				b[i] = z / 13;
				a[i + 1] = z % 13;
		  }
		  yu = a[i];
		  if (b[1] == 0)
		  {
			  qishi = 2;
		  }
		  else
		  {
			  qishi = 1;
		  }
		  for (j = qishi;j <= m - 1;j++)
		  {
		  System.out.printf("%d",b[j]);
		  }
		  System.out.print("\n");
		  System.out.printf("%d\n",yu);

		 }
	}
	}



}

