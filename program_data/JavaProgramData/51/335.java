package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[250]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		int i = 0;
		int j = 0;
		int k = 0;
		int[] v = new int[250];
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		for (i = 0;i <= len - n;i++)
		{

			for (j = i;j < i + n;j++)
			{
				b[k][j - i] = a.charAt(j);
			}
			k++;
		}
	   /* for(i=0;i<=len-n;i++)
	    {
	        printf("%s\n",b[i]);
	    }*/
		int m = v[0];
	  for (j = 0;j < k;j++)
	  {
			for (i = j;i < k;i++)
			{
				if (!strcmp(b[j],b[i]))
				{
					v[j]++;
				}
			}

	  }
	 /*   for(i=0;i<=len-n;i++)
	    {
	        printf("%d ",v[i]);
	    }*/
		for (i = 0;i < k;i++)
		{
			if (v[i] > m)
			{
				m = v[i];
			}
		}
		if (m > 1)
		{


		System.out.printf("%d\n",m);
		for (i = 0;i < k;i++)
		{
			if (v[i] == m)
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

