/*
 * mokuahihua.cpp
 *
 *  Created on: 2012-11-27
 *      Author: wenjun
 */
int[] a = new int[100];
int[] b = new int[100];
int c;
int d;
void read(int,int);
void rank(int,int);
void print(int,int);
int main()
{
	c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	read(c,d);
	rank(c,d);
	print(c,d);
}
void read(int n,int m)
{
	for (int i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (int i = 0;i < m;i++)
	{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
}
void rank(int n,int m)
{
	int temp;
	for (int i = 0;i < n - 1;i++)
	{
		for (int j = 0;j < n - 1 - i;j++)
		{
			if (a[j] > a[j + 1])
			{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
	for (int i = 0;i < m - 1;i++)
	{
			for (int j = 0;j < m - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
	}
}
void print(int n,int m)
{
	for (int i = 0;i < n;i++)
	{
		System.out.print(a[i]);
		System.out.print(" ");
	}
	for (int i = 0;i < m;i++)
	{
		System.out.print(b[i]);
		if (i != m - 1)
		{
			System.out.print(" ");
		}
	}

}


