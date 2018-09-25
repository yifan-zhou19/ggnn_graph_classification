import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*#include<stdio.h>
	void main()
	{
		int n,i,j,k,max[100],c[100],m[100];
		char a[100][10],b[100][3];
		
	
		
			scanf("%s ",a[i]);
			for(j=0;j<3;j++)
				scanf("%c",&b[i][j]);
		}
	
		for(i=0;i<n;i++)
			for(j=0;j<10;j++)
			{
				if(a[i][j]!=' '&&a[i][j+1]==' ')break;
				c[i]=j;
			}
	
			for(i=0;i<n;i++)
			{
				m[i]=a[i][0];max[i]=0;
				for(j=0;j<=c[i];j++)
				if(m[i]<a[i][j])
				{
					m[i]=a[i][j];
				    max[i]=j;
				}
			}
	
				/*for(k=0;k<c[i]-1;k++)
				{
					max[i]=k;
				for(j=k+1;j<=c[i];j++)
				   if(a[i][k]<a[i][j])
						max[i]=j;
				}*/
		/*
			for(i=0;i<n;i++)
			{
				for(j=0;j<=max[i];j++)
					printf("%c",a[i][j]);
				for(k=0;k<3;k++)
					printf("%c",b[i][k]);
				if(max[i]==c[i])
					printf("\n");
				else if(max[i]<c[i])
				{
					for(j=max[i]+1;j<c[i];j++)
						printf("%c",a[i][j]);
					    printf("%c\n",a[i][c[i]]);
				}
			}
	}*/
	public static int Main()
	{
	String a = new String(new char[11]);
	String str = new String(new char[4]);
	char max;
	int position;
	int i = 0;
	while (cin.getline(a,(Character.SIZE / Byte.SIZE),' ') && str = new Scanner(System.in).nextLine())
	{
		max = a.charAt(0);
		for (i = 0;i < a.length();i++)
		{
			if (max < a.charAt(i))
			{
				max = a.charAt(i);
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (max == a.charAt(i))
			{
				position = i;
				break;
			}
		}
		for (i = 0;i <= position;i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print(str);
		for (i = position + 1;i < a.length();i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
	}
	return 0;
	}


}
