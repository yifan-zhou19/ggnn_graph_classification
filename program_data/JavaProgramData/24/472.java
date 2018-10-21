package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] l = new int[100];
		int max;
		int n;
		int min;
		char[][] c = new char[100][30];
		String c1 = new String(new char[30]);
		String c2 = new String(new char[30]);
		/*scanf("%d",&n);
		for(i=0;i<n;i++)
		{scanf("%s",c[i]);l[i]=strlen(c[i]);}*/
		for (i = 0;;i++)
		{
			if (scanf("%s",c[i]) == EOF)
			{
				break;
			}
			l[i] = String.valueOf(c[i]).length();
		}
		n = i;
		max = l[0];
		c1 = c[0];
		for (i = 0;i < n;i++)
		{
			if (l[i] > max)
			{
				max = l[i];
				c1 = c[i];
			}
		}
		min = l[0];
		c2 = c[0];
		for (i = 0;i < n;i++)
		{
			if (l[i] < min)
			{
				min = l[i];
				c2 = c[i];
			}
		}
		System.out.printf("%s\n",c1);
		System.out.printf("%s\n",c2);
	}



}
