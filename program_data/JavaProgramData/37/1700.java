package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int b;
		  int j;
		  int k;
		  int m;
		  m = 0;
		  String a = new String(new char[100001]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= t;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }
			  b = a.length();
			  for (j = 0;j <= b - 1;j++)
			  {

					for (k = 0;k <= b - 1;k++)
					{
						  if (a.charAt(j) != a.charAt(k))
						  {
						  m = m + 1;
						  }

						  //if(a[j]==a[j+k+1])
						  //break;
					}
					  //printf("%d ",m);
					if (m == b - 1 && i != t)
					{
						 System.out.printf("%c\n",a.charAt(j));
						 break;
					}
					else if (m == b - 1 && i == t)
					{
						 System.out.printf("%c",a.charAt(j));
						 break;
					}
					  m = 0;

				   /* else if(j==b-1&&i!=t)
				    printf("%c\n",a[b-1]);
				    else if(j==b-1&&i==t)
				    printf("%c",a[b-1]);*/

			  }
			   if (j == b && i != t)
			   {
			   System.out.print("no\n");
			   }
			   if (j == b && i == t)
			   {
			   System.out.print("no");
			   }
			   m = 0;
		  }
	}
}

