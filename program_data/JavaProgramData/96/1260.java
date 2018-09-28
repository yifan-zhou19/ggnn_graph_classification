package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  int c = 0;
		  int l = 0;
		  int i = 0;
		  int j = 0;
		  int d = 0;
		  int[] b = new int[100];
		  int[] f = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  //printf("%d",l);
		  for (i = 0;i < l;i++)
		  {
			  b[i] = a.charAt(i) - '0';
		  }
		  //for(i=0;i<l;i++)    printf("%d",b[i]); 
		  d = b[0];
		  if (l > 2)
		  {
			  for (i = 1;i <= l - 1;i++)
			  {
					c = b[i];
					d = c + d * 10;
					if (d >= 13)
					{
						  f[i - 1] = d / 13;
						d = d % 13;
					}
				  else
				  {
				  f[i - 1] = 0;
				  }
				  if (i == l - 1)
				  {
				  j = d;
				  }
			  }
			  if (f[0] != 0)
			  {
			  System.out.printf("%d",f[0]);
			  }
			  for (i = 1;i < l - 1;i++)
			  {
			  System.out.printf("%d",f[i]);
			  }
			  System.out.printf("\n%d",j);
		  }
		  else if (l == 2)
		  {
			  c = b[0] * 10 + b[1];
			  System.out.printf("%d\n%d",c / 13,c % 13);
		  }
		  else
		  {
			  System.out.printf("0\n%d",b[0]);
		  }

	}
}

