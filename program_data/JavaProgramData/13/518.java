package <missing>;

public class GlobalMembers
{
	/*
	 * my project5.cpp
	 *
	 *  Created on: 2010-11-5
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//cout<<endl;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		/*
		for(i=0;i<n-t;i++){
			for(j=i+1;j<n-t;j++){
				if(a[j]==a[i]){
				  t++;
				  for(k=j;k<n-1;k++){
				 a[k]=a[k+1];
				}
				  j--;
	
				}
	
				}
	
				}
	
		i=n-t;
	
		for(i=0;i<n-t-1;i++)
			cout<<a[i]<<" ";
	   cout<<a[n-t-1]<<endl;*/

		for (i = 0; i < n; i++)
		{
			if (a[i] >= 0)
			{
				for (j = i + 1; j < n; j++)
				{
					if (a[i] == a[j])
					{
						a[j] = -1;
					}
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] >= 0)
			{
				if (i > 0)
				{
					System.out.print(' ');
				}
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

