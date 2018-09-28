package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n1 = 0; //n??????  n1??????????? del?????? a???
	int n = 0;
	int[] a = new int[100005];
	int del = 0;
	n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = n1;
	for (int i = 1;i <= n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int h = 1; //h ?????????
	do
	{
		if (a[h] == del)
		{
		 for (int i = h + 1;i <= n;i++)
		 {
			 a[i - 1] = a[i];
		 } //????????? ???????????????????
		 n--;
		 h--;
		}
		h++;
	} while (h <= n);
	for (int j = 1;j <= n - 1;j++)
	{
		System.out.print(a[j]);
		System.out.print(' ');
	}
	System.out.print(a[n]);
	return 0;
	}



}

