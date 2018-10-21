package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int t = 0;
		int[] y = new int[100];
		int x;
		int[] a = new int[100];
		int[] b = new int[100];
		char[][] s = new char[100][20];
		String temp = new String(new char[20]);
		char[][] s1 = new char[100][20];
		char[][] s2 = new char[100][20];
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
			 s[i] = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 y[i] = Integer.parseInt(tempVar3);
		 }
		}
		for (i = 0;i < n;i++)
		{
		  if (y[i] >= 60)
		  {
			s1[k] = s[i];
			a[k] = y[i];
			k++;
		  }
		}
	  //    for(i=0;i<k;i++)
	  //    printf("%s %d@@\n",s1[i],a[i]);
		for (i = 0;i < k - 1;i++)
		{
		 for (j = 0;j < k - i - 1;j++)
		 {
		 if (a[j] < a[j + 1])
		 {
			x = a[j];
			a[j] = a[j + 1];
			a[j + 1] = x;
			temp = s1[j];
			s1[j] = s1[j + 1];
			s1[j + 1] = temp;
		 }
		 }
		}
		 for (i = 0;i < k;i++)
		 {
		 System.out.printf("%s\n",s1[i],a[i]);
		 }
		   for (i = 0;i < n;i++)
		   {
		  if (y[i] < 60)
		  {
			s2[t] = s[i];
			t++;
		  }
		   }
		 for (i = 0;i < t;i++)
		 {
		 System.out.printf("%s\n",s2[i]);
		 }
		 return 0;
	}

}

