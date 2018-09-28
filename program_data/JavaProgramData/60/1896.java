package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int m;
			int a;
			int b;
			int p;
			int q;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n < 5)
			{
			  System.out.print("empty");
			}
			else
			{
			a = 3;
			}
			b = a + 2;
			m = 2;
			while (b <= n)
			{
			  while (m <= a - 1)
			  {
			  p = a % m;
			  q = b % m;
				  if (b > n)
				  {
				  break;
				  }
				  else
				  {
			  if (p == 0 || q == 0)
			  {
				a = a + 1;
				b = a + 2;
				m = 2;
			  }
			   else
			   {
				m = m + 1;
			   }
				  }
			  }
				  if (b > n)
				  {
				  break;
				  }
				  else
				  {
				  System.out.printf("%d %d\n",a,b);
				  }
				  a = a + 1;
				  b = b + 1;
				  m = 2;
			}
				 return 0;
		}
}

