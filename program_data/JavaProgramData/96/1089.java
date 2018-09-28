package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[MAX + 1]);
		  int[] b = new int[MAX + 1];
		  int[] c = new int[MAX + 1];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  int len = a.length();
		  int i;
		  int p;
		  int k;
		  for (i = 0;i < len;i++)
		  {
			  b[i] = a.charAt(i) - '0';
		  }
		  b[i] = 0;
		  if (len == 2 && b[0] * 10 + b[1] <= 12)
		  {
		  System.out.printf("0\n%d\n",b[0] * 10 + b[1]);
		  }
		  else if (len == 1)
		  {
			  System.out.printf("0\n%d\n",b[0]);
		  }
		  else
		  {
		  for (k = 0;k < len - 1;k++)
		  //{
		  //if(b[k]=='\0') 
		  //{
		  //p=k; 
		  //break;
		  //}
		  //else 
		  {
			   int m;
			   m = b[k] * 10 + b[k + 1];
			   c[k] = m / 13;
			   b[k + 1] = m % 13;
		  }
		  //}

		  if (c[0] != 0)
		  {
		  System.out.printf("%d",c[0]);
		  }
		  for (int j = 1;j <= k - 1;j++)
		  {
		  System.out.printf("%d",c[j]);
		  }
		  System.out.print("\n");

		  System.out.printf("%d\n",b[k]);
		  }
	}

}

