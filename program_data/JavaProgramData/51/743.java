package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[502]);
		char[][] str = new char[502][6];
		 int[] a = new int[502];
		 int x;
		 int u;
		 int n;
		 int v;
		 int max;
		 int t;
		 int p;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 string = tempVar2.charAt(0);
		 }
		 x = String.length();
		  for (u = 0;u < x - n + 1;u++)
		  {
			for (v = 0;v < n;v++)
			{
			  str[u][v] = string.charAt(u + v);
			}
		  }
		  for (u = 0;u < x - n + 1;u++)
		  {
			 a[u] = 0;
		  }
		  for (u = 0;u < x - n + 1;u++)
		  {
				for (v = 0;v < x - n + 1;v++)
				{
				 if (strcmp(str[u],str[v]) == 0)
				 {
			  a[u]++;
				 }
				}
		  }
		  max = a[0];
		  t = 0;
		  for (u = 0;u < x - n + 1;u++)
		  {
				if (a[u] > max)
				{
				   max = a[u];
				t = u;
				}
		  }

		  if (max > 1)
		  {
			  System.out.printf("%d\n",max);
			p = 1;
			if (a[0] == max && p == 1)
			{
			System.out.printf("%s\n", str[0]);
			}
			for (u = 1;u < x - n + 1;u++)
			{
				p = 0;
			 for (v = u - 1;v >= 0;v--)
			 {
				 if (strcmp(str[u],str[v]) != 0)
				 {
				p = 1;
				 }
			  else
			  {
				   p = 0;
				break;
			  }
			 }
			 if (a[u] == max && p == 1)
			 {
			 System.out.printf("%s\n", str[u]);
			 }
			}
		  }
		  if (max == 1)
		  {
		  System.out.print("NO\n");
		  }
	}

}

