package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int m;
		int n;
		int t = 1;
		int[] r = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		if (m == n)
		{
			  for (i = 0;i <= m - 1;i++)
			  {
			 for (j = 0;j <= n - 1;j++)
			 {
				if (b.charAt(j) == a.charAt(i) && r[j] == 0)
				{
				r[j] = 1;
				break;
				}
			 }
			  }
		   for (i = 0;i <= n - 1;i++)
		   {
			 if (r[i] == 0)
			 {
			 t = 0;
			 break;
			 }
		   }
		}
		else
		{
			t = 0;
		}
		if (t == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		   return (0);
	}
}

