package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m = 0;
	 int n;
	 int i;
	 int j;
	 int t = 0;
	 int[] num = new int[100];
	 int[] a = new int[100];
	 String string = new String(new char[11]);
	 char[][] stm = new char[100][11];
	 char[][] str = new char[100][11];
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
		  stm[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  num[i] = Integer.parseInt(tempVar3);
	  }
	 }
	  j = 0;
	  for (i = 0;i < n;i++)
	  {
	   if (num[i] >= 60)
	   {
		a[j] = num[i];
		str[j] = String.valueOf(stm[i]).substring(0, 10);
		j++;
		t = j - 1;
	   }
	  }
		for (j = 0;j < t;j++)
		{
		  for (i = 0;i < t - j;i++)
		  {
			if (a[i] < a[i + 1])
			{
			  m = a[i];
			   a[i] = a[i + 1];
			   a[i + 1] = m;
			   String = String.valueOf(str[i]).substring(0, 10);
			   str[i] = String.valueOf(str[i).substring(1], 1] + 10);
			   str[i + 1] = String.substring(0, 10);
			}
		  }
		}
		for (i = 0;i <= t;i++)
		{
		  System.out.printf("%s\n",str[i]);
		}
		for (i = 0;i < n;i++)
		{
		if (num[i] < 60)
		{
		System.out.printf("%s\n",stm[i]);
		}
		}
		System.in.read();
		System.in.read();
	}

}

