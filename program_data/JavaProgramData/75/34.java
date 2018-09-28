package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m = 0;
	 int[] a = new int[1000];
	 int[] b = new int[1000];
	 int[] c = new int[1000];
	 int i;
	 int j;
	 int s = 0;
	 int s1 = 1;
	 char x;
	 i = 0;
	 while (true)
	 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		x = System.in.read();
		m = m + 1;
		if (x != ',')
		{
			break;
		}
		i++;
	 }
		i = 0;
	 while (true)
	 {
		 s++;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		x = System.in.read();
		if (x != ',')
		{
			break;
		}
		i++;
	 }

	 for (i = 0;i < 1000;i++)
	 {
			for (j = 0;j < 1000;j++)
			{
				if (i < b[j] && i >= a[j])
				{
					c[i]++;
				}
			}
	 }

	  for (i = 0;i < 1000;i++)
	  {
		  if (c[i] > s1)
		  {
			  s1 = c[i];
		  }
	  }
	  System.out.printf("%d %d",s,s1);



	}

}

