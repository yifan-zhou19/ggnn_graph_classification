package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][20];
		char ch;
		int i = 0;
		int j;
		int[] b = new int[50];
		int max = 0;
		int min = 20;
		int maxi;
		int mini;

		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				ch = System.in.read();
				if (ch == ' ' || ch == '\n')
				{
					a[i][j] = '\0';
					b[i] = j;
					break;
				}
			   a[i][j] = ch;
				/*printf("%c%d\n",ch,j);  */
			}
			if (ch == '\n')
			{
			break;
			}

		}

		a[i][j] = '\0';
	  /*  for(i=0;i<10;i++)
	    {
	        printf("%s\n",a[i]);
	    }       */
		  for (i;i >= 0;i--)
		  {
		   /* printf("%d",b[i]);
		    printf("%s\n",a[i]);  */
			if (b[i] >= max)
			{
				max = b[i];
			maxi = i;
			}
			if (b[i] <= min)
			{
				min = b[i];
			mini = i;
			}

		  }
		   System.out.printf("%s\n%s",a[maxi],a[mini]);


	}

}
