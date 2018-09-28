package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 200;
	 public static char[][] arrA = new char[MAXN + 10][MAXN + 10];
	 public static char[][] arrB = new char[MAXN + 10][MAXN + 10];
	 char a[MAXN + 10],(*b)[MAXN + 10];
	 public static int Main()
	 {
		 a = arrA;
		 b = arrB;
		 int n;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 1;i <= n;i++)
		 {
			 for (int j = 1;j <= n;j++)
			 {
				 a[i][j] = ConsoleInput.readToWhiteSpace(true);
			 }
		 }
		 int m;
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 m--;
		 while (m-- != 0)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(b,'.',(Character.SIZE / Byte.SIZE));
			 for (int i = 1;i <= n;i++)
			 {
				 for (int j = 1;j <= n;j++)
				 {
					 if (a[i][j] == '@')
					 {
						 b[i][j] = b[i + 1][j] = b[i][j + 1] = b[i - 1][j] = b[i][j - 1] = '@';
					 }
				 }
			 }
			for (int i = 1;i <= n;i++)
			{
				 for (int j = 1;j <= n;j++)
				 {
					 if (a[i][j] == '#')
					 {
						 b[i][j] = '#';
					 }
				 }
			}
			swap(a,b);
		 }
		 int s = 0;
		 for (int i = 1;i <= n;i++)
		 {
			 for (int j = 1;j <= n;j++)
			 {
				 if (a[i][j] == '@')
				 {
					 s++;
				 }
			 }
		 }
				 System.out.print(s);
				 System.out.print("\n");
	 }

	 /*
	
	char getAChar(){
		int ch=getchar();
		while(ch!='#' && ch!='.' && ch!='@')ch=getchar();
		return ch;
	}
	int main()
	{
		static int n,i,j,m,k,g,sum=0,temp1[MAXN*MAXN+10],temp2[MAXN*MAXN+10],r;
	
		scanf("%d",&n);
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]=getAChar();
		scanf("%d",&m);
	    for(k=1;k<m;k++){
			r=1;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
					if(a[i][j]=='@')
					{
						temp1[r]=i;
						temp2[r]=j;
						r+=1;
					}
			}
			for(g=1;g<r;g++)
			{
				i=temp1[g];j=temp2[g];
				if(a[i+1][j]=='.') {a[i+1][j]='@';}
				if(a[i][j+1]=='.') {a[i][j+1]='@';}
				if(a[i-1][j]=='.') {a[i-1][j]='@';}
				if(a[i][j-1]=='.') {a[i][j-1]='@';}
			}
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(a[i][j]=='@'){sum+=1;}
			}
		}
		printf("%d\n",sum);
	
		return 0;
	}
	*/
}

