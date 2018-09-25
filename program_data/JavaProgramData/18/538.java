package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;++i)
		{
			int sum = 0;
			int[][] t = new int[101][101];
			for (j = 0;j < n;++j)
			{
				for (k = 0;k < n;++k)
				{
					t[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			int cnt = n;
			while (cnt > 1)
			{
				for (j = 0;j < cnt;++j)
				{
					int min = t[j][0];
					for (k = 1;k < cnt;++k)
					{
						if (t[j][k] < min)
						{
							min = t[j][k];
						}
					}
					for (k = 0;k < cnt;++k)
					{
						t[j][k] -= min;
					}
				}

				for (j = 0;j < cnt;++j)
				{
					int min = t[0][j];
					for (k = 1;k < cnt;++k)
					{
						if (t[k][j] < min)
						{
							min = t[k][j];
						}
					}
					for (k = 0;k < cnt;++k)
					{
						t[k][j] -= min;
					}
				}

				sum += t[1][1];
				/*
				for(j=0;j<cnt;++j){
					for(k=0;k<cnt;++k){
						cout<<t[j][k]<<" ";       
					}    
					cout<<endl;
				}
				*/
				for (j = 0;j < n;++j)
				{
					for (k = 1;k < n;++k)
					{
						t[j][k] = t[j][k + 1];
					}
				}
				for (j = 0;j < n;++j)
				{
					for (k = 1;k < n;++k)
					{
						t[k][j] = t[k + 1][j];
					}
				}
				/*
				for(j=0;j<cnt-1;++j){
					for(k=0;k<cnt-1;++k){
						cout<<t[j][k]<<" ";       
					}    
					cout<<endl;
				}
				cout<<endl;
				*/
				cnt--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
			return 0;
	}

}

