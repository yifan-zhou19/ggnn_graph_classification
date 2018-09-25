package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] ID = new char[n][10];
		int[] age = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ID[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  age[i] = Integer.parseInt(tempVar3);
		  }
		}
		char[][] ID2 = new char[n][10];
		int[] b = new int[n];
		int j = 0;
		int t;
		int k;
		for (i = 0;i <= n - 1;i++)
		{
		 if (age[i] >= 60)
		 {
		 b[j] = age[i];
		 ID2[j] = ID[i];
		 j++;
		 }
		}
		String c = new String(new char[10]);
		for (k = 0;k < j - 1;k++)
		{
		 for (i = 0;i < j - 1 - k;i++)
		 {
			if (b[i] < b[i + 1])
			{
		   t = b[i];
		   b[i] = b[i + 1];
		   b[i + 1] = t;
		   c = ID2[i];
		   ID2[i] = ID2[i + 1];
		   ID2[i + 1] = c;
			}
		 }
		}
		 for (i = 0;i < j;i++)
		 {
		 System.out.printf("%s\n",ID2[i]);
		 }
		 char[][] ID3 = new char[n][10];
		 int m = 0;
		 for (i = 0;i < n;i++)
		 {
		  if (age[i] < 60)
		  {
		   ID3[m] = ID[i];
		   m++;
		  }
		 }
		  for (i = 0;i < m;i++)
		  {
		  System.out.printf("%s\n",ID3[i]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

