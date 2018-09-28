package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] ch =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] b = new int[100];
		int i = 0;
		int j = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		int m;
		int n;
		int x = 0;
		int y = 0;
	   while (i < a.length())
	   {
			while (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != 0)
			{
				ch[j][k++] = a.charAt(i++);
				b[j]++;
			}
			if (k != 0)
			{
				j++;
				k = 0;
			}
			i++;
	   }
	   /* for(i=0;i<=j;i++)
	    {
	        printf("%s %d \n",ch[i],b[i]);
	    }*/
	   m = b[0];
		for (i = 1;i < j;i++)
		{
			if (b[i] > m)
			{
				m = b[i];
				x = i;
			}
		}
		n = b[0];
		for (i = 1;i < j;i++)
		{
			if (b[i] < n)
			{
				n = b[i];
				y = i;
			}
		}

		System.out.printf("%s\n%s",ch[x],ch[y]);
		return 0;
	}
}
