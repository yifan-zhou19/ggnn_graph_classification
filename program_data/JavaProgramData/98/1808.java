package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[1000];
		int[] d = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		/*char a[1000][100];*/
		char[][] a = new char[200][100];
		int i;
		int j;
		int k;
		int lc;
		int m;
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			b[i] = String.valueOf(a[i]).length();
		}
		/*cin.getline(c,9999);
		lc=strlen(c);
		b[0]=-1;
		j=1;*/
		/*for(i=0;i<lc;i++)
		{
			if(c[i]==' ')
			{
				b[j]=i;m=0;
				for(k=b[j-1]+1;k<b[j];k++)
				{
					a[j-1][m]=c[k];m=m+1;}
				a[j-1][m]='\0';
				j=j+1;
			}
			if(j==n)
				break;
		}
		m=0;
		for(k=b[j-1]+1;k<lc;k++)
		{
			a[n-1][m]=c[k];m=m+1;
		}
		a[n-1][m]='\0';
		for(i=0;i<n;i++)
			d[i]=strlen(a[i]);*/

		/*for(i=0;i<n-1;i++)
		{
			for(j=0;;j++)
				cin>>a[i][j];
			b[i]=j;
			a[i][j+1]='\0';
		}
		cin.getline(a[n-1],100);
		b[n-1]=strlen(a[n-1]);*/
		int l;

		l = b[0];
		System.out.print(a[0]);
		for (i = 1;i < n - 1;i++)
		{
			l = l + 1 + b[i];
			if (l > 80)
			{
				System.out.print("\n");
				System.out.print(a[i]);
				l = b[i];
			}
			else
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}
		l = l + 1 + b[n - 1];
		if (l <= 80)
		{
			System.out.print(' ');
			System.out.print(a[n - 1]);
		}
		else
		{
			System.out.print("\n");
			System.out.print(a[n - 1]);
		}
		return 0;


	}



}

