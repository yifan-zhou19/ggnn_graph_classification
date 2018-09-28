package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int[] age = new int[1000];
	 int[] a = new int[1000];
	 int t;
	 char[][] ID = new char[1000][1000];
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
		  ID[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  age[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 j = n - 1;
	 k = 0;
	 for (i = n - 1;i >= 0;i--)
	 {
	  if (age[i] < 60)
	  {
	   a[j] = i;
	   j--;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (age[i] >= 60)
	  {
	   a[k] = i;
	   k++;
	  }
	 }

	 for (i = 0;i < k;i++)
	 {
	  for (j = k - 1;j > i;j--)
	  {
	   if (age[a[j]] > age[a[j - 1]])
	   {
		t = a[j];
		a[j] = a[j - 1];
		a[j - 1] = t;
	   }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  System.out.printf("%s\n",ID[a[i]]);
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 return 0;

	}

}

