package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] n = new char[100][1000];
		int i;
		int j;
		int m = 0;
		int l;
		int k = 0;
		String w = new String(new char[1000]);
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		w = new Scanner(System.in).nextLine();
		j = w.length();
		for (i = 0;i < j;i++)
		{
			   if (w.charAt(i) != ' ')
			   {
				  n[m][k] = w.charAt(i);
				  k++;
			   }
			else
			{
				n[m][k] = '\0';
				m++;
				k = 0;
			}
		}
		n[m][k] = '\0';
		m++;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		for (i = 0;i < m;i++)
		{
		   if (strcmp(n[i],x) == 0)
		   {
			 n[i] = y;
		   }
		}
		for (i = 0;i < m;i++)
		{
		   if (i == m - 1)
		   {
		   System.out.printf("%s",n[i]);
		   }
		   else
		   {
			   System.out.printf("%s ",n[i]);
		   }
		}
	}

}

