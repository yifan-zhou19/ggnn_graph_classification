package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int su = int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  int a;
		  int b;
		  a = 3,b = 5;
		  if (m < 5)
		  {
			  System.out.print("empty\n");
		  }
		  else
		  {
			   do
			   {
			   if (su(a) != 0 && su(b) != 0)
			   {
			   System.out.printf("%d %d\n",a,b);
			   }
		  a += 2;
		  b += 2;
			   } while (b <= m);
		  }
	}
		  public static int su(int n)
		  {
			  int i;
			  int p = 1;
			  for (i = 2;i < n / 2;i++)
			  {
								if (n % i == 0)
								{
									p = 0;
								break;
								}
			  }
			  return (p);
		  }
}

