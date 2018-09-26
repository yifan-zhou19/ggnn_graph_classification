package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[105]);
		  int[] a = new int[105];
		  int[] p = new int[105];
		  int i;
		  int len;
		  int t = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  len = str.length();
		  for (i = 0;i < len;i++)
		  {
		   a[i] = str.charAt(i) - '0';
		  }
		  if (len == 2 && 10 * a[0] + a[1] < 13)
		  {
		  System.out.printf("0\n%d\n",10 * a[0] + a[1]);
		  }
		  else
		  {
			  if (len == 1)
			  {
						 System.out.printf("0\n%d\n",a[0]);
			  }
			  else
			  {
						t = a[0] * 10 + a[1];
						p[0] = t / 13;
						t = t % 13;
						 if (p[0] != 0)
						 {
									System.out.printf("%d",p[0]);
						 }
						 for (i = 2;i < len;i++)
						 {
							 t = t * 10 + a[i];
							 p[i - 1] = t / 13;
							 System.out.printf("%d",p[i - 1]);
							 t = t % 13;
						 }
					System.out.printf("\n%d\n",t);
			  }
		  }
	}

}

