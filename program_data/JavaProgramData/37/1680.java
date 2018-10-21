package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (k = 0;k < n;k++)
		  {
		  int p = 0;
		  int i;
		  int j;
		  int m = 0;
		  int q = 0;
		  String a = new String(new char[100010]);
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  for (i = 0;a.charAt(i) != 0;i++)
		  {
		  p++;
		  }
		  for (i = 0;i < p;i++)
		  {
						  for (j = 0;j < p;j++)
						  {
								if (a.charAt(i) != a.charAt(j))
								{
								m++;
								}
						  }
								if (m == p - 1)
								{
									System.out.printf("%c\n",a.charAt(i));
								 break;
								}
								 else
								 {
									 m = 0;
								 q++;
								 }
		  }
								   if (q == p)
								   {
								   System.out.print("no\n");
								   }
		  }

	}

}

