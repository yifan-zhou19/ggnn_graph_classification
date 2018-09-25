package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int m;
		int t;
		int p;
		int r;
		int[] a = new int[100];
		int[] b = new int[100];
		char[][] str1 = new char[100][10];
		char[][] str2 = new char[100][10];
		String string = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (p = 0,s = 0;p < n;p++)
		{
		if (a[p] >= 60)
		{
		b[s] = a[p];
		str2[s] = str1[p];
		s = s + 1;
		}
		}
		for (k = 0;k < (s - 1);k++)
		{
		for (m = 0;m < (s - k - 1);m++)
		{
		 if (b[m + 1] > b[m])
		 {
		 t = b[m + 1];
		 b[m + 1] = b[m];
		 b[m] = t;
		 String = str2[m + 1];
		 str2[m + 1] = str2[m];
		 str2[m] = String;
		 }
		}
		}
		 for (j = 0;j < s;j++)
		 {
		 System.out.printf("%s\n",str2[j]);
		 }
		 for (r = 0;r < n;r++)
		 {
		 if (a[r] < 60)
		 {
		 System.out.printf("%s\n",str1[r]);
		 }
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}
}

