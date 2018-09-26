//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	/*#include<stdio.h>
	void main()
	{
		int n,i,j,k,sum=0,a[20],all=0;
		scanf("%d",&n);
		for(i=0;i<n;i++)
		{
			scanf("%d",&a[i]);
		}
		if(n==0)
			all=60;
		else
		{
		for(i=0;i<n;i++)
		{
			sum=3+a[i];
			if(sum<60 && i!=n-1)
				continue;
			if(sum<60 && i==n-1)
				break;
			if(sum>=60)
				j=i;
				break;
		}
		
		if(i=n-1)
		{
				all=60-3*(i+1);
		}
		else
		{
			if(sum-3>=60)
			all=a[j]-(sum-3-60);
			if(sum-3<60)
				
					all=a[j];
		}
		}
		printf("%d",all);
	}*/
	public static void Main()
	{
		int i;
		int n;
		int m;
		int j;
		int flag = 0;
		int temp = 0;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int k;
		int p;
		int t = -1;
		int[] x = new int[19];
		String s = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= m;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					flag = 1;
					break;
				}
				else
				{
					flag = 0;
				}
					continue;
			}


			if (i / 100000 > 0 && i / 1000000 == 0)
			{
				a = i / 100000;
				s = tangible.StringFunctions.changeCharacter(s, 0, a + 48);
				b = (i - a * 100000) / 10000;
				s = tangible.StringFunctions.changeCharacter(s, 1, b + 48);
				c = (i - a * 100000 - b * 10000) / 1000;
				s = tangible.StringFunctions.changeCharacter(s, 2, c + 48);
				d = (i - a * 100000 - b * 10000 - c * 1000) / 100;
				s = tangible.StringFunctions.changeCharacter(s, 3, d + 48);
				e = (i - a * 100000 - b * 10000 - c * 1000 - d * 100) / 10;
				s = tangible.StringFunctions.changeCharacter(s, 4, e+48);
					f = (i - a * 100000 - b * 10000 - c * 1000 - d * 100 - e * 10);
					s = tangible.StringFunctions.changeCharacter(s, 5, f + 48);

			s = tangible.StringFunctions.changeCharacter(s, 6, '\0');
			}
			if (i / 10000 > 0 && i / 100000 == 0)
			{
				a = i / 10000;
				s = tangible.StringFunctions.changeCharacter(s, 0, a + 48);
				b = (i - a * 10000) / 1000;
				s = tangible.StringFunctions.changeCharacter(s, 1, b + 48);
				c = (i - a * 10000 - b * 1000) / 100;
				s = tangible.StringFunctions.changeCharacter(s, 2, c + 48);
				d = (i - a * 10000 - b * 1000 - c * 100) / 10;
				s = tangible.StringFunctions.changeCharacter(s, 3, d + 48);
				e = (i - a * 10000 - b * 1000 - c * 100 - d * 10);
				s = tangible.StringFunctions.changeCharacter(s, 4, e+48);
			s = tangible.StringFunctions.changeCharacter(s, 5, '\0');

			}

			if (i / 1000 > 0 && i / 10000 == 0)
			{
				a = i / 1000;
				s = tangible.StringFunctions.changeCharacter(s, 0, a + 48);
				b = (i - a * 1000) / 100;
				s = tangible.StringFunctions.changeCharacter(s, 1, b + 48);
				c = (i - a * 1000 - b * 100) / 10;
				s = tangible.StringFunctions.changeCharacter(s, 2, c + 48);
				d = (i - a * 1000 - b * 100 - c * 10);
				s = tangible.StringFunctions.changeCharacter(s, 3, d + 48);
			s = tangible.StringFunctions.changeCharacter(s, 4, '\0');

			}
			if (i / 100 > 0 && i / 1000 == 0)
			{
				a = i / 100;
				s = tangible.StringFunctions.changeCharacter(s, 0, a + 48);
				b = (i - a * 100) / 10;
				s = tangible.StringFunctions.changeCharacter(s, 1, b + 48);
				c = (i - a * 100 - b * 10);
				s = tangible.StringFunctions.changeCharacter(s, 2, c + 48);
				s = tangible.StringFunctions.changeCharacter(s, 3, '\0');
			}
			if (i / 10 > 0 && i / 100 == 0)
			{
				a = i / 10;
				s = tangible.StringFunctions.changeCharacter(s, 0, a + 48);
				b = (i - a * 10);
				s = tangible.StringFunctions.changeCharacter(s, 1, b + 48);

				s = tangible.StringFunctions.changeCharacter(s, 2, '\0');
			}
			p = s.length();
			k = 0;
			while (2 * k <= p != 0 && s.charAt(k) == s.charAt(p - 1 - k)) //????????????????????
			{
				k = k + 1;
			}
			if (2 * k >= p)
			{
			  temp = 1;
			}
			 else
			 {
			  temp = 0;
			 }

			 if (temp == 1 && flag == 0)
			 {
				 t++;
			 x[t] = i;
			 }

		}
		if (t == -1)
		{
			System.out.print("no");
		}
		else
		{
		for (k = 0;k < t;k++)
		{
			 System.out.printf("%d,",x[k]);
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


