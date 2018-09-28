package <missing>;

public class GlobalMembers
{
	/*
	 * m,n.cpp
	 *
	 *  Created on: 2011-12-11
	 *      Author: FXD
	 */
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int m;
		int i;
		int j;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null,*q=null,*r=null,*s=null,*x=null,*y=null;
		int p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=null;
		int q = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *r=null;
		int r = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s=null;
		int s = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x=null;
		int x = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *y=null;
		int y = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a[0];
		q = a[n - 1];
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			t = q;
			q = p;
			p = t;
			p++;
			q--;
		}
		r = a[0];
		s = a[m - 1];
		for (i = 0,j = m - 1;i < j;i++,j--)
		{
			t = s;
			s = r;
			r = t;
			r++;
			s--;
		}
		x = a[m];
		y = a[n - 1];
		for (i = m,j = n - 1;i < j;i++,j--)
		{
			t = y;
					y = x;
					x = t;
					x++;
					y--;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;

	}

}

